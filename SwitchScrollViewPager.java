package com.weilei.myviewpager.views;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;

/**
 * Created by weilei on 16-8-30.
 */
public class SwitchScrollViewPager extends ViewPager{
    private boolean isScrollable = false;

    public SwitchScrollViewPager(Context context) {
        super(context);
    }

    public SwitchScrollViewPager(Context context, AttributeSet attributeSet){
        super(context,attributeSet);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        if (isScrollable == false) {
            return false;
        } else {
            return super.onTouchEvent(event);
        }

    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent event) {
        if (isScrollable == false) {
            return false;
        } else {
            return super.onInterceptTouchEvent(event);
        }

    }
}
