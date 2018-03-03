package com.example.entropy.gag9;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by entropy on 3/3/2018.
 */

public class PostsViewHolder extends BaseViewHolder<Posts>{

@BindView(R.id.txt_title)  TextView txtTitle;
@BindView(R.id.img_post) ImageView imgPost;

    public PostsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
@Override
    public void setData (Posts item ){
        txtTitle.setText(item.getTitle());
        Picasso.with(itemView.getContext()).load(item.getImageUrl()).into(imgPost);
    }
}
