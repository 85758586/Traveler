package com.me.traveler.strategy;

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

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyListAdapter extends RecyclerView.Adapter<StrategyListAdapter.ViewHolder> {

    private List<Strategy> mDataList;
    private IStrategyListView mView;

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        public TextView mTextView;
        public ImageView mImageView;
        public Strategy mStrategy;
        public ViewHolder(View rootView) {
            super(rootView);
            mTextView = (TextView)rootView.findViewById(R.id.title);
            mImageView = (ImageView)rootView.findViewById(R.id.image);
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
        return new StrategyListAdapter.ViewHolder(rootView);
    }


    @Override
    public void onBindViewHolder(StrategyListAdapter.ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(holder);
        holder.mStrategy = mDataList.get(position);
        holder.mTextView.setText(mDataList.get(position).getGuidesName());
        ImageLoader imageLoader = MyApplication.getApp().getmImageLoader();
        DisplayImageOptions options = MyApplication.getApp().getmOptions();
        holder.mImageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageLoader.displayImage(mDataList.get(position).getGuidesPic(), holder.mImageView, options);
    }


    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return mDataList.size();
    }
}
