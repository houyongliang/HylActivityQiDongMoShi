package com.hyl.hylactivityqidongmoshi.activity;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.hyl.hylactivityqidongmoshi.R;
import com.hyl.hylactivityqidongmoshi.fragment.Fragment1;
import com.hyl.hylactivityqidongmoshi.fragment.Fragment2;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    public static int count=0;
    private String TAG="MainActivity";
    private FrameLayout frameLayout;
    private List<Fragment> list=null;
    private FragmentManager manager;
    Handler mHandler=new Handler(){
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = (FrameLayout) findViewById(R.id.frameLayout_main);
        initFragment();/*初始化fragment*/
        Message message=Message.obtain();
        message.what=1;
//        mHandler.sendEmptyMessageDelayed(message);
        mHandler.post(new Runnable() {
            @Override
            public void run() {

            }
        });
        count++;
        Log.e(TAG, "onCreate:count "+count);
    }

    private void initFragment() {
        list=new ArrayList<>();
        list.add(new Fragment1());
        list.add(new Fragment2());



        /*获取碎片管理器*/
        manager = getSupportFragmentManager();
        FragmentTransaction ft= manager.beginTransaction();//获取事务
        ft.replace(R.id.frameLayout_main,list.get(0),"fragment1");
        ft.commit();
//             manager = getSupportFragmentManager();
//        FragmentTransaction ft= manager.beginTransaction();/*获取事务*/
//        ft.add(R.id.frameLayout_main,list.get(0),"fragment1");
//        ft.add(R.id.frameLayout_main,list.get(1),"fragment2");
//        ft.hide(list.get(1));
//        ft.show(list.get(0));
//        ft.commit();

   /*  可实现
    ((Fragment1)list.get(0)).setListener(new Fragment1.ToActivityListener() {
            @Override
            public void goToActivity(String text) {
                Toast.makeText(MainActivity.this, text, Toast.LENGTH_SHORT).show();
            }
        });*/

/*可实现
        Bundle bd=new Bundle();
        bd.putString("data","你真帅");
        Fragment2 fragment2 = (Fragment2) list.get(1);
        fragment2.setArguments(bd);
        Fragment2.newInstance("你真帅");*/

    }



    public void standard(View v){
        startActivity(new Intent(this,MainActivity.class));
    }
    public void singleTop(View v){
        startActivity(new Intent(this,TopActivity.class));
    } public void singleTask(View v){
        startActivity(new Intent(this,TaskActivity.class));
    }
    public void singleInstance(View v) {
        startActivity(new Intent(this,InsActivity.class));
    }
    public void replaceFragment(View v){
        FragmentManager manager = getSupportFragmentManager();//获取碎片管理器
        FragmentTransaction ft=manager.beginTransaction();//获取事务
        ft.replace(R.id.frameLayout_main,list.get(1),"fragment2");
        ft.commit();
//             FragmentTransaction ft=manager.beginTransaction();//获取事务
//        ft.hide(list.get(0));
//        ft.show(list.get(1));
//        ft.commit();

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart:count "+count);
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop:count "+count);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(count>0)
            count--;
        Log.e(TAG, "onDestroy:count "+count);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "onRestart:count "+count);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause:count "+count);
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume:count "+count);
    }
}
