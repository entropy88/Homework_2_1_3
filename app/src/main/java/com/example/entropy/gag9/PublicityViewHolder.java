package com.example.entropy.gag9;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by entropy on 3/3/2018.
 */

public class PublicityViewHolder extends BaseViewHolder<Publicity>{


@BindView(R.id.img_publicity) ImageView img_pub;

    public PublicityViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
   @Override
    public void setData(Publicity item){
       Picasso.with(itemView.getContext()).load(item.getImageUrl()).into(img_pub);
   }
}
