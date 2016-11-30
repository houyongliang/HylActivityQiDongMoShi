package com.hyl.hylactivityqidongmoshi.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;

import com.hyl.hylactivityqidongmoshi.R;
import com.hyl.hylactivityqidongmoshi.fragment.Fragment1;
import com.hyl.hylactivityqidongmoshi.fragment.Fragment2;

public class InsActivity extends AppCompatActivity {
    public static int count=0;
    private String TAG="InsActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count++;
        Log.e(TAG, "onCreate:count "+count);
        FrameLayout  frameLayout = (FrameLayout) findViewById(R.id.frameLayout_main);
        initFragment();/*初始化fragment*/
    }

    private void initFragment() {

        FragmentManager manager = getSupportFragmentManager();/*获取碎片管理器*/
        FragmentTransaction ft=manager.beginTransaction();/*获取事务*/
        ft.replace(R.id.frameLayout_main,new Fragment1(),"fragment1");
        ft.commit();
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

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "onStart:count ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop:count ");
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
        Log.e(TAG, "onRestart:count ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "onPause:count ");
    }



    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "onResume:count ");
    }
    public void replaceFragment(View v){
        FragmentManager manager = getSupportFragmentManager();/*获取碎片管理器*/
        FragmentTransaction ft=manager.beginTransaction();/*获取事务*/
        ft.replace(R.id.frameLayout_main,new Fragment2(),"fragment2");
        ft.commit();
    }
}
