package com.hyl.hylactivityqidongmoshi;


import android.content.Context;
import android.os.Bundle;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Fragment2 extends Fragment {
    public static int count=0;
    private  String TAG="Fragment2";
    private TextView tv_fg2;


    public Fragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        count++;
        Log.e(TAG, "onCreateView: +++++++++++++++"+count );
        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        tv_fg2 = (TextView) view.findViewById(R.id.tv_fg2);
        return view;
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

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e(TAG, "onActivityCreated: +---------------------"+count);
//        Bundle bundle = getArguments();
//        if(bundle!=null){
//            String data = bundle.getString("data","");
//            tv_fg2.setText(data);
//        }
//        Fragment1 fragment1=(Fragment1) getActivity().getSupportFragmentManager().findFragmentByTag("fragment1");
//        fragment1.setInstance(new Fragment1.newInstance() {
//            @Override
//            public void getInstance(String argument) {
//                tv_fg2.setText(argument);
//            }
//        });
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e(TAG, "onStart: ++++++++++++++++++++++++++++++++++"+count );
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e(TAG, "onResume: ++++++++++++++++++++++++++++++"+count );
        Fragment1 fragment1=(Fragment1) ((MainActivity)getActivity()).getSupportFragmentManager().findFragmentByTag("fragment1");
        fragment1.setListener(new Fragment1.ToActivityListener() {
            @Override
            public void goToActivity(String text) {
                Toast.makeText(getActivity(), text, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e(TAG, "onPause: ++++++++++++++++++++++++++++++++++++" +count);
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
        Log.e(TAG, "onDestroy: +++++++++++++++++++++" +count);
    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.e(TAG, "onDetach: +++++++++++++++++++++++++++"+count );
    }

    /**
     * 传入需要的参数，设置给arguments

     * @return
     */

//    public static Fragment2 newInstance(String argument)
//    {
//        Bundle bundle = new Bundle();
//        bundle.putString("data", argument);
//        Fragment2 f2 = new Fragment2();
//        f2.setArguments(bundle);
//        return f2;
//    }

//    public  void setData(String argument)
//    {
//        instance.getInstance(argument);
//
//
//    }
}
