package com.example.basicwidget;
//Do it! 안드로이드 앱 프로그래밍 [개정4판&개정5판] - Day12-01
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton radioButton = (RadioButton) findViewById(R.id.radioButton);
        boolean checked = radioButton.isChecked();


    }


}
