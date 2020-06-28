package com.example.hello2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.hello2.MESSAGE";
    private ViewPager mViewPager;
    private List<Fragment>mFragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
        List<Fragment> fragments = new ArrayList<Fragment>();
        fragments.add(new MyFragment1());
        fragments.add(new MyFragment2());
        fragments.add(new MyFragment3());
        fragments.add(new MyFragment4());

        MyFragmentAdapter myFragmentAdapter = new MyFragmentAdapter(getSupportFragmentManager(),0,fragments);
        mViewPager.setAdapter(myFragmentAdapter);
    }
    void init(){
        mViewPager = findViewById(R.id.vp);
        Button btn_main = (Button)findViewById(R.id.btn_main);
        Button btn_IntoMess = (Button)findViewById(R.id.btn_IntoMess);
        Button btn_IntoSec = (Button)findViewById(R.id.btn_IntoSec);
        Button btn_IntoThird = (Button)findViewById(R.id.btn_IntoThird);

        btn_main.setOnClickListener(new Click());
        btn_IntoMess.setOnClickListener(new Click());
        btn_IntoSec.setOnClickListener(new Click());
        btn_IntoThird.setOnClickListener(new Click());
    }

    class Click implements View.OnClickListener{
        @Override
        public void onClick(View view) {
            switch (view.getId()){
                case R.id.btn_main:
                    Intent intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.baidu.com"));
                    startActivity(intent);
                    break;
                case R.id.btn_IntoMess:
                    Intent intent1 = new Intent(MainActivity.this,MessageActivity.class);
                    startActivityForResult(intent1,1);
                    break;
                case R.id.btn_IntoSec:
                    Intent intent2 = new Intent(MainActivity.this,SecondActivity.class);
                    startActivity(intent2);
                    break;
                case R.id.btn_IntoThird:
                    Intent intent3 = new Intent(MainActivity.this,ThirdActivity.class);
                    startActivity(intent3);
                    break;
                default:
                    break;
            }
        }
    }

    class MyFragmentAdapter extends FragmentPagerAdapter{

        public MyFragmentAdapter(@NonNull FragmentManager fm,
                                 int behavior,List<Fragment>fragments) {
            super(fm, behavior);
            mFragmentList = fragments;
        }
        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You clicked Add",Toast.LENGTH_SHORT).show();
                break;
            case R.id.Remove:
                Toast.makeText(this,"You clicked Remove",Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}


