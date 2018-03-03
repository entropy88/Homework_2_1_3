package com.example.entropy.gag9;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by entropy on 3/3/2018.
 */

class ItemAdapter extends RecyclerView.Adapter<BaseViewHolder> {
    private static final int TYPE_POST = 1;
    private static final int TYPE_PUBLICITY = 2;

    private List<AllTheStuff> data;

    public ItemAdapter(List<AllTheStuff> data) {

        this.data = data;
    }

    @Override
    public int getItemViewType(int position) {
        AllTheStuff item = data.get(position);
        if (item instanceof Posts) {
            return TYPE_POST;

        }
        return TYPE_PUBLICITY;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        BaseViewHolder vh = null;

        if (viewType == TYPE_POST) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.post_layout, parent, false);
            vh = new PostsViewHolder(view);

        } else {
            if (viewType == TYPE_POST) {
                View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.publicity_layout, parent, false);
                vh = new PublicityViewHolder(view);
            }

        } return vh;


    }


    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        AllTheStuff item = data.get(position);
        holder.setData(item);
    }

    @Override
    public int getItemCount() {

        return data.size();
    }
}