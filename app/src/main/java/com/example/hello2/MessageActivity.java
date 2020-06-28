package com.example.hello2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);
        init();
    }
    void init(){
        Button btn_mess = (Button)findViewById(R.id.btn_mess);

        btn_mess.setOnClickListener(new Click());
    }
    class Click implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_mess:
                    Intent intent = new Intent();
                    intent.putExtra("data_return","Hello MainActivity");
                    setResult(RESULT_OK,intent);
                    finish();
                    break;
                default:
                    break;
            }
        }
    }
}