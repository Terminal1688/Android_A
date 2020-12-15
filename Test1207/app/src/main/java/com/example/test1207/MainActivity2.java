package com.example.test1207;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView textView3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView3=findViewById(R.id.textView3);
        Intent intent=getIntent();
        String userName=intent.getStringExtra("userName");
        String passWord=intent.getStringExtra("passWord");
        textView3.setText("获取到的值是：\n用户名："+userName+"\n密码："+passWord);
    }
}