package com.me.traveler.util;

import android.util.SparseArray;
import android.view.View;

/**
 * Created by Administrator on 2016/2/26.
 */
public class ListViewHolder {
    public static <T extends View> T get(View view, int id){
        SparseArray<View> viewHolder = new SparseArray<View>();
        if (viewHolder == null){
            viewHolder = new SparseArray<View>();
            view.setTag(viewHolder);
        }

        View childView = viewHolder.get(id);
        if (childView == null){
            childView = view.findViewById(id);
            viewHolder.put(id, childView);
        }
        return (T) childView;
    }
}
