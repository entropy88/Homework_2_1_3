package com.example.entropy.gag9;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by entropy on 3/3/2018.
 */

class CommentsAdapter extends RecyclerView.Adapter<CommentViewHolder> {


    private List<Comments> data;

    public CommentsAdapter(List<Comments> data) {

        this.data = data;
    }


    @Override
    public CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        CommentViewHolder vh = null;
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.comments_layout, parent, false);
        vh = new CommentViewHolder(view);
    return vh;

}

    @Override
    public void onBindViewHolder(CommentViewHolder holder, int position) {
        Comments item = data.get(position);
        holder.setData(item);
    }



    @Override
    public int getItemCount() {

        return data.size();
    }
}