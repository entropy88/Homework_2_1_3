package com.example.entropy.gag9;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by entropy on 3/3/2018.
 */

public abstract class BaseViewHolder<T> extends RecyclerView.ViewHolder {

    public BaseViewHolder(View itemView) {
        super(itemView);
    }

    public abstract void setData(T data);
}
