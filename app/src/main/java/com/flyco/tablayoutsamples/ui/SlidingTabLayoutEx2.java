package com.flyco.tablayoutsamples.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;

import com.flyco.tablayout.SlidingTabLayout2;

public class SlidingTabLayoutEx2 extends SlidingTabLayout2 {
    public SlidingTabLayoutEx2(Context context) {
        super(context);
    }

    public SlidingTabLayoutEx2(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public SlidingTabLayoutEx2(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getIndicatorDrawable().setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        getIndicatorDrawable().setGradientType(GradientDrawable.LINEAR_GRADIENT);
        getIndicatorDrawable().setColors(new int[]{Color.RED,Color.BLUE});
        getIndicatorDrawable().draw(canvas);
    }
}
