package com.lenovo.feizai.androidtool;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


import com.lenovo.feizai.AndroidTool.util.Base64Util;
import com.lenovo.feizai.AndroidTool.util.TimeUtil;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text = findViewById(R.id.text);
        text.setText(Base64Util.encode("123"));
        Toast.makeText(this, TimeUtil.date2String(new Date()), Toast.LENGTH_SHORT).show();
    }
}