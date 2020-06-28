package com.example.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Button btn_back = (Button)findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String data = "Hello Activity";
                Intent intent3 = new Intent(ThirdActivity.this,SecondActivity.class);
                intent3.putExtra("extra_data",data);
                startActivity(intent3);
            }
        });
        Button btn_back1 = (Button)findViewById(R.id.btn_back1);
        btn_back1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(ThirdActivity.this,MainActivity.class);
                startActivity(intent3);
            }
        });
    }
}