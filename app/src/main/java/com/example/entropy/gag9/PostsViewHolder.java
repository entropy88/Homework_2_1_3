package com.example.entropy.gag9;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by entropy on 3/3/2018.
 */

public class PostsViewHolder extends BaseViewHolder<Posts>{

@BindView(R.id.txt_title)  TextView txtTitle;
@BindView(R.id.img_post) ImageView imgPost;
    @BindView(R.id.img_up)    ImageButton btnUp;
    @BindView(R.id.img_down) ImageButton btnDown;
    @BindView(R.id.img_comment) ImageButton btnComment;

    public PostsViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
@Override
    public void setData (Posts item ){
        txtTitle.setText(item.getTitle());
        Picasso.with(itemView.getContext()).load(item.getImageUrl()).into(imgPost);
    }


   @OnClick (R.id.img_up)
    public void onUppedClicked(){
       btnUp.setBackgroundResource(R.drawable.blue);
       btnDown.setBackgroundResource(R.drawable.gray);
   }

    @OnClick (R.id.img_down)
    public void onDownClicked(){
        btnDown.setBackgroundResource(R.drawable.blue);
        btnUp.setBackgroundResource(R.drawable.gray);
    }

    @OnClick (R.id.img_comment)
    public void onCommented(){
        Intent comentActivity= new Intent (itemView.getContext(),commentsActivity.class);
        itemView.getContext().startActivity(comentActivity);
    }
}
