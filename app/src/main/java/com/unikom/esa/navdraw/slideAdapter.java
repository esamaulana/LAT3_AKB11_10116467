package com.unikom.esa.navdraw;

// 25 - 04 - 19
// esa maulana
// 10116467
// akb11 / if 11

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class slideAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public slideAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_images = {

            R.drawable.avatar,
            R.drawable.group11 ,
            R.drawable.group12,
    };

    public String[] slide_juduls = {
            "Welcome to NavDraw!",
            "Amazing Features",
            "All in One App"
    };

    public String[] slide_descr = {
            "Amazing Android App with cool features",
            "5+ Amazing Feature and it's 100% free to use",
            "Well, it's basically about me.."
    };

    @Override
    public int getCount() {
        return slide_juduls.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view == (RelativeLayout) o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slide_layout, container, false);

        ImageView slideImageView = (ImageView) view.findViewById(R.id.slide_image);
        TextView slideHeading = (TextView) view.findViewById(R.id.slide_judul);
        TextView slideDescription = (TextView) view.findViewById(R.id.slide_desc);

        slideImageView.setImageResource(slide_images[position]);
        slideHeading.setText(slide_juduls[position]);
        slideDescription.setText(slide_descr[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object){
        container.removeView((RelativeLayout)object);
    }

}
