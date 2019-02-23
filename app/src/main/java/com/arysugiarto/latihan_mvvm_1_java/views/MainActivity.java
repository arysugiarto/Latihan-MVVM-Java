package com.arysugiarto.latihan_mvvm_1_java.views;

import android.app.Activity;
import android.databinding.BindingAdapter;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.arysugiarto.latihan_mvvm_1_java.R;
import com.arysugiarto.latihan_mvvm_1_java.databinding.ActivityMainBinding;
import com.arysugiarto.latihan_mvvm_1_java.viewmodels.LoginViewModel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setViewModel(new LoginViewModel());
        activityMainBinding.executePendingBindings();
    }
    @BindingAdapter({"toastMessage"})
    public static void runMe(View view,String message){
        if (message != null)
            Toast.makeText(view.getContext(), message,Toast.LENGTH_SHORT).show();
    }
}
