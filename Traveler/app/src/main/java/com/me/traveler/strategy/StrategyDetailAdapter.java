package com.me.traveler.strategy;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.me.traveler.MyApplication;
import com.me.traveler.R;
import com.me.traveler.entity.StrategyIntro;
import com.me.traveler.util.ListViewHolder;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.List;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetailAdapter extends RecyclerView.Adapter<StrategyDetailAdapter.ViewHolder> {

    private LayoutInflater mInflater;
    private List<StrategyIntro> mDataList;
    private View mRootView;

    public static class ViewHolder extends RecyclerView.ViewHolder {
        public TextView mTextView;
        public ImageView mImageView;
        public ViewHolder(View rootView) {
            super(rootView);
            mTextView = (TextView)rootView.findViewById(R.id.text);
            mImageView = (ImageView)rootView.findViewById(R.id.image);
        }
    }

    // Provide a suitable constructor (depends on the kind of dataset)
    public StrategyDetailAdapter(List<StrategyIntro> list) {
        mDataList = list;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public StrategyDetailAdapter.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                   int viewType) {
        // create a new view
        mRootView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recycler_strategy_detail, parent, false);
        return new StrategyDetailAdapter.ViewHolder(mRootView);
    }

    @Override
    public void onBindViewHolder(StrategyDetailAdapter.ViewHolder holder, int position) {
        holder.mTextView.setText(mDataList.get(position).getItemDescription());
        ImageLoader imageLoader = MyApplication.getApp().getmImageLoader();
        DisplayImageOptions options = MyApplication.getApp().getmOptions();
        holder.mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageLoader.displayImage(mDataList.get(position).getItemPicture(), holder.mImageView, options);
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
