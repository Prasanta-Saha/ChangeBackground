package com.example.changebackground;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout cl;
    TextView tv;
    int index=0;
    int images[]={R.drawable.harakrishna1,R.drawable.harakrishna2,R.drawable.harakrishna3,R.drawable.harakrishna4};
    //ArrayList(R.drawable.harakrishna1,R.drawable.harakrishna2,R.drawable.harakrishna3,R.drawable.harakrishna4);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cl=(ConstraintLayout)findViewById(R.id.layout);
        tv=(TextView)findViewById(R.id.textView);
    }

    public void changeback(View view) {
        cl.setBackgroundResource(images[index]);
        tv.setVisibility(View.INVISIBLE);
        index++;
        if (index==images.length){
            index=0;
        }
    }
}
