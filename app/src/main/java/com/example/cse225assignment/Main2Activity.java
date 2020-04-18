package com.example.cse225assignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    EditText et1,et2,et3,et4;
    ImageView im1,im2,im3;
    RadioButton genderradioButton;
    RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        et3 = findViewById(R.id.et3);
        et4 = findViewById(R.id.et4);
        im1 = findViewById(R.id.im1);
        im2 = findViewById(R.id.im2);
        im3 = findViewById(R.id.im3);
        radioGroup = findViewById(R.id.radioGroup);
        im1.setOnClickListener(this); //it will implement the onClick methods work
        im2.setOnClickListener(this);
        im3.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(et1.getText().toString().isEmpty() || et2.getText().toString().isEmpty() ||
                et3.getText().toString().isEmpty() || et4.getText().toString().isEmpty()   )
        {
            Toast.makeText(this,"please enter the values",Toast.LENGTH_SHORT).show();

        }
        else
        {

            Intent i = new Intent();
            i.putExtra("name",et1.getText().toString());
            i.putExtra("number",et2.getText().toString());
            i.putExtra("web",et3.getText().toString());
            i.putExtra("map",et4.getText().toString());
            if(view.getId() == R.id.im1 )
            {
                i.putExtra("mood","happy");
            }
            else if(view.getId() == R.id.im2)
            {
                i.putExtra("mood","neutral");
            }
            else
            {
                i.putExtra("mood","sad");
            }
            setResult(RESULT_OK,i);
            Main2Activity.this.finish();
        }

    }
}