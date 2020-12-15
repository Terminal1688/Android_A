package com.example.test1207;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button button1, button2;
    EditText et_userName, et_passWord;
    private EditText editText;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        et_userName = findViewById(R.id.et_userName);
        et_passWord = findViewById(R.id.et_passWord);
        imageView = findViewById(R.id.image_view);
        button2.setOnClickListener((View.OnClickListener)this);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("userName", et_userName.getText().toString());
                intent.putExtra("passWord", et_passWord.getText().toString());
                startActivity(intent);
            }
        });
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button2:
                imageView.setImageResource(R.drawable.img2);
                break;
            default:
                break;
        }
    }
}