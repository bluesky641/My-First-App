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
        init();
    }
    void init(){
        Button btn_back = (Button)findViewById(R.id.btn_back);
        Button btn_back1 = (Button)findViewById(R.id.btn_back1);

        btn_back.setOnClickListener(new Click());
        btn_back1.setOnClickListener(new Click());
    }
    class Click implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_back:
                    String data = "Hello Activity";
                    Intent intent = new Intent(ThirdActivity.this,SecondActivity.class);
                    intent.putExtra("extra_data",data);
                    startActivity(intent);
                    break;
                case R.id.btn_back1:
                    Intent intent3 = new Intent(ThirdActivity.this,MainActivity.class);
                    startActivity(intent3);
                    break;
                default:
                    break;
            }
        }
    }
}