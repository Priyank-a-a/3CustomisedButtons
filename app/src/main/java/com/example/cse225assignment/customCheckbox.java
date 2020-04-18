package com.example.cse225assignment;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatCheckBox;
public class customCheckbox extends AppCompatCheckBox implements View.OnClickListener {
    public OnClickListener event;
    public void setCustomClickListener(OnClickListener event) {
        this.event = event;
    }
    public interface OnClickListener {
        public void onClick(View var1);
    }
    public customCheckbox(Context context) {
        super(context);
    }

    public customCheckbox(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public customCheckbox(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    CheckBox mcheckbox;
    @Override
    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener listener) {
        super.setOnCheckedChangeListener(listener);
        mcheckbox.setButtonDrawable(R.drawable.checked);
    }
    /*@Override
    public void setOnClickListener(@Nullable OnClickListener l) {
        super.setOnClickListener(l);

    }*/
    @Override
    public void onClick(View view) {
    }
}