package com.example.button3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn3 ;
     int mone = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn3= findViewById(R.id.btn3) ;
    }

    public void go(View view) {
        mone++;
        btn3.setText( "This is a click number:"+ mone ) ;
        if (mone == 6) {
            btn3.setText("Enough to click. Go to new start!");
            mone=0 ;
        }
} }