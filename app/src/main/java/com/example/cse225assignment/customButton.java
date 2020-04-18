package com.example.cse225assignment;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.widget.AppCompatButton;
public class customButton extends AppCompatButton implements View.OnClickListener, View.OnTouchListener {
    private CustomOnClickListener event;
    public OnTouchListener listener;
    private Context mContext;
    Button button;
    public customButton(Context context) {
        super(context);
    }
    public customButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        mContext = context;
        setOnClickListener(this);
    }
    public customButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
    @Override
    public void onClick(View v) {
        event.onClick(v);
    }

    public void setCustomClickListener(CustomOnClickListener event) {
        this.event = event;
    }

    @Override
    public boolean onTouch(View view, MotionEvent event) {
        if (event.getAction() == MotionEvent.ACTION_DOWN)
        {
            float x = (float) 1.25;
            float y = (float) 1.25;

            button.setScaleX(x);
            button.setScaleY(y);
            button.setBackgroundResource(R.drawable.circle);
        }

        else if(event.getAction() == MotionEvent.ACTION_UP)
        {
            float x = 1;
            float y = 1;
            button.setScaleX(x);
            button.setScaleY(y);
            button.setBackgroundResource(R.drawable.circle);

        }
        return true;

    }
    public interface CustomOnClickListener {
        public void onClick(View var1);
    }
}


