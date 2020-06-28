package com.example.hello2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

//        Intent intent3 = getIntent();
//        String data = intent3.getStringExtra("extra_data");
//        Log.d("MainActivity",data);
//        Button btn_sec = findViewById(R.id.btn_sec);
//        btn_sec.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
////                Intent intent = new Intent(Intent.ACTION_DIAL);
////                intent.setData(Uri.parse("tel:10086"));
////                startActivity(intent);
                finish();
//            }
//        });
    }
}