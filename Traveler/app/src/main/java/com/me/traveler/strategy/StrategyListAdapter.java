package com.me.traveler.strategy;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.me.traveler.MyApplication;
import com.me.traveler.R;
import com.me.traveler.entity.Strategy;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.nostra13.universalimageloader.core.listener.SimpleImageLoadingListener;

import java.util.List;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyListAdapter extends RecyclerView.Adapter<StrategyListAdapter.ViewHolder> {

    private List<Strategy> mDataList;
    private IStrategyListView mView;
    private Context mContext;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mTextView;
        public ImageView mImageView;
        public View mTitleBackground;
        public Strategy mStrategy;
        public ViewHolder(View rootView) {
            super(rootView);
            mTextView = (TextView)rootView.findViewById(R.id.title);
            mImageView = (ImageView)rootView.findViewById(R.id.image);
            mTitleBackground = rootView.findViewById(R.id.title_background);
        }

        @Override
        public void onClick(View v) {
            mView.onStrategyClicked(mStrategy);
        }
    }

    public StrategyListAdapter(List<Strategy> list, IStrategyListView view){
        mDataList = list;
        mView = view;
    }

    @Override
    public StrategyListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                               int viewType) {
        // create a new view
        View rootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_strategy_list, parent, false);
        mContext = parent.getContext();
        return new StrategyListAdapter.ViewHolder(rootView);
    }


    @Override
    public void onBindViewHolder(final StrategyListAdapter.ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(holder);
        holder.mStrategy = mDataList.get(position);
        holder.mTextView.setText(mDataList.get(position).getGuidesName());

        ImageLoader imageLoader = MyApplication.getApp().getmImageLoader();
        DisplayImageOptions options = MyApplication.getApp().getmOptions();
        holder.mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageLoader.loadImage(mDataList.get(position).getGuidesPic(), new SimpleImageLoadingListener() {
            @Override
            public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
                Palette.from(loadedImage).generate(new Palette.PaletteAsyncListener()
                {
                    @Override
                    public void onGenerated(Palette palette)
                    {
                        holder.mTitleBackground.setBackgroundColor(palette.getVibrantColor(mContext
                                .getResources().getColor(R.color.colorWhite)));
                    }
                });
            }
        });
        imageLoader.displayImage(mDataList.get(position).getGuidesPic(), holder.mImageView, options);

    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
