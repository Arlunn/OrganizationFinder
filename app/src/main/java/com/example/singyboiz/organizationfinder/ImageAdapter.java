package com.example.singyboiz.organizationfinder;

import android.content.Context;

import android.support.v4.view.PagerAdapter;

import android.support.v4.view.ViewPager;

import android.view.View;

import android.view.ViewGroup;

import android.widget.ImageView;
import android.widget.TextView;


/**

 * Created by SrceCde on 18-09-2015.

 */

public class ImageAdapter extends PagerAdapter {

    Context context;
    private int pos;
    MainActivity mActivity;

    private int[] GalImages = new int[] {


            R.drawable.androidtestimage,    //Here first,second,third... are the name of the jpeg files placed in drawable folder

            R.drawable.pineapple

    };

    ImageAdapter(Context context, MainActivity mActivityInput){
        mActivity = mActivityInput;
        this.context=context;

    }

    public int getPos() {
        return pos;
    }
    @Override

    public int getCount() {

        return GalImages.length;

    }


    @Override

    public boolean isViewFromObject(View view, Object object) {

        return view == ((ImageView) object);

    }


    @Override

    public Object instantiateItem(ViewGroup container, int position) {

        ImageView imageView = new ImageView(context);

        pos = position;

        imageView.setImageResource(GalImages[position]);
        mActivity.SetClubNameText();
        ((ViewPager) container).addView(imageView, 0);

        return imageView;

    }



    @Override

    public void destroyItem(ViewGroup container, int position, Object object) {

        ((ViewPager) container).removeView((ImageView) object);

    }

}