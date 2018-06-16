package com.dellpv.app1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
TextView t1,t2,t3,t4;
    ProgressBar p;
    SeekBar s;
    Button b1,b2,b3,b4,b5;
    ToggleButton t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t1=(TextView)findViewById(R.id.textView);
        t2=(TextView)findViewById(R.id.textView3);
        t3=(TextView)findViewById(R.id.textView4);
        t4=(TextView)findViewById(R.id.textView7);
        s=(SeekBar)findViewById(R.id.seekBar);
        p=(ProgressBar)findViewById(R.id.progressBar3);
        t=(ToggleButton)findViewById(R.id.toggleButton);
        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button4);
        b3=(Button)findViewById(R.id.button5);
        b4=(Button)findViewById(R.id.button6);
        b5=(Button)findViewById(R.id.button7);













    }
}
