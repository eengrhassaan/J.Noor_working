package com.example.lenovo.jnoor;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

/**
 * Created by LENOVO on 9/25/2017.
 */

public class Weekly_details extends android.support.v4.app.Fragment {
    //Variables for Buttons and Text View
    TextView tv1;
    FloatingActionButton bt1,bt2;
    RadioGroup rgq1;
    RadioButton q1op1,q1op2,q1op3,q1op4;

    public static Weekly_details newInstance() {
        Weekly_details fragment = new Weekly_details();
        return fragment;
    }

    public Weekly_details(){
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

    }

    @Override
    public void onStart() {
        super.onStart();
//        Animation imgs = AnimationUtils.loadAnimation(getContext(),R.anim.slide_out);
//        Animation tvs = AnimationUtils.loadAnimation(getContext(),R.anim.slide_in);
//        rgq1.startAnimation(imgs);
//        tv1.startAnimation(tvs);
    }

    @Override
    public void onResume() {
        super.onResume();
//        Animation imgs = AnimationUtils.loadAnimation(getContext(),R.anim.slide_out);
//        Animation tvs = AnimationUtils.loadAnimation(getContext(),R.anim.slide_in);
//        rgq1.startAnimation(imgs);
//        tv1.startAnimation(tvs);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.weekly_details, container, false);
        return rootView;
    }


}

