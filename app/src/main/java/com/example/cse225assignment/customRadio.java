package com.example.cse225assignment;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatRadioButton;

public class customRadio extends AppCompatRadioButton {
    private RadioGroup.OnCheckedChangeListener listener1;

    public customRadio(Context context) {
        super(context);
    }

    public customRadio(Context context, AttributeSet attrs) {
        super(context, attrs);


    }

    public customRadio(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);

    }

    @Override
    public void setOnCheckedChangeListener(@Nullable OnCheckedChangeListener listener) {
        super.setOnCheckedChangeListener(listener);
        this.listener1 = listener1;
    }
}
