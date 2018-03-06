package com.example.entropy.gag9;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by entropy on 3/3/2018.
 */

public class PublicityViewHolder extends BaseViewHolder<Publicity>{


@BindView(R.id.img_publicity) ImageView img_pub;
@BindView(R.id.btn_buy) Button buy_this;

    public PublicityViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this, itemView);
    }
   @Override
    public void setData(Publicity item){
       Picasso.with(itemView.getContext()).load(item.getImageUrl()).into(img_pub);
   }

//    @OnClick(R.id.btn_buy)
//    public void buyClicked(){
//      Intent webIntent= new Intent(Intent.ACTION_VIEW);
//        String url="www.google.com";
//        webIntent.setData(Uri.parse(url));
//
//
//    }


}
