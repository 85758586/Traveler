package com.me.traveler.strategy;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.me.traveler.MyApplication;
import com.me.traveler.R;
import com.me.traveler.entity.Strategy;
import com.me.traveler.util.ListViewHolder;
import com.nostra13.universalimageloader.core.DisplayImageOptions;
import com.nostra13.universalimageloader.core.ImageLoader;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyListAdapter extends BaseAdapter {
    private LayoutInflater mInflater;
    private List<Strategy> mDataList = new ArrayList<>();

    public StrategyListAdapter(Context context){
        mInflater = LayoutInflater.from(context);
    }

    public void setDataList(List<Strategy> list){
        mDataList = list;
    }

    @Override
    public int getCount() {
        return mDataList.size();
    }

    @Override
    public Object getItem(int position) {
        return mDataList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null){
            convertView = mInflater.inflate(R.layout.item_listview_strategy_list, null);
        }

        ImageLoader imageLoader = MyApplication.getApp().getmImageLoader();
        DisplayImageOptions options = MyApplication.getApp().getmOptions();
        ImageView imageView = ListViewHolder.get(convertView, R.id.image);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);
        imageLoader.displayImage(mDataList.get(position).getGuidesPic(), imageView, options);

        TextView textView = ListViewHolder.get(convertView, R.id.title);
        textView.setText(mDataList.get(position).getGuidesName());

        return convertView;
    }
}
