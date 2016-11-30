package com.hyl.hylactivityqidongmoshi.fragment;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hyl.hylactivityqidongmoshi.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment1 extends Fragment {
    private ToActivityListener listener;
    public String TAG="Fragment1";
    public static int count=0;
    public Fragment1() {
        // Required empty public constructor
    }
    public void setListener(ToActivityListener listener){
        this.listener=listener;
    }
    interface  ToActivityListener{
         void goToActivity(String text);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        count++;
        Log.e(TAG, "------------onCreateView: "+count);
        return inflater.inflate(R.layout.fragment_fragment1, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.e(TAG, "onAttach: -------------------"+count);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.e(TAG, "onCreate: -------------------"+count );
//        Fragment2 mFragment2=new Fragment2();
//        Bundle bd=new Bundle();
//        bd.putString("data","你真帅");
//        mFragment2.setArguments(bd);
       // Fragment fragment2 = ((MainActivity)getActivity()).getSupportFragmentManager().findFragmentByTag("fragment2");
       // fragment2.setArguments(bd);
//        instance.getInstance("你真帅");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated: +---------------------"+count);
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ++++++++++++++++++++++++++++++++++" +count);
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ++++++++++++++++++++++++++++++"+count );
         /*实现 fragment 向 activity 传值 接口方式*/
//        Bundle bd=new Bundle();
//        bd.putString("data","你真帅");
//        Fragment2 fragment2=(Fragment2) ((MainActivity)getActivity()).getSupportFragmentManager().findFragmentByTag("fragment2");
//        fragment2.setArguments(bd);
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ++++++++++++++++++++++++++++++++++++"+count );
//        listener.goToActivity("你真帅");
//        Bundle bd=new Bundle();
//        bd.putString("data","你真帅");
////        mFragment2.setArguments(bd);
//     Fragment2 fragment2 = (Fragment2) ((MainActivity)getActivity()).getSupportFragmentManager().findFragmentByTag("fragment2");
//        fragment2.setArguments(bd);

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: ++++++++++++++++++++++++++++++++++"+count);
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.e(TAG, "onDestroyView: +++++++++++++++++++++++++++++++++++"+count );
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "onDestroy: +++++++++++++++++++++"+count );
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach: +++++++++++++++++++++++++++"+count );
    }
}
