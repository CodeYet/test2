package com.test.dy.test2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/**
 * Created by dy on 2015/10/18.
 */
public class EditT extends TouchDelegate {
    Activity activity;
    Context context;

    public EditT(Rect bounds, View delegateView, Activity activity) {
        super(bounds, delegateView);
        this.activity = activity;
    }

    public EditT(Rect bounds, View delegateView, Context context, Activity activity) {
        super(bounds, delegateView);
        this.context = context;
        this.activity = activity;
    }


}
