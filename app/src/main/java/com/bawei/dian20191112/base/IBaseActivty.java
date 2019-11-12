package com.bawei.dian20191112.base;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.bawei.lixin1111.app.App;

public abstract class IBaseActivty extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        if (initLayout()!=0){
            setContentView(initLayout());
            initView();
            initData();
        }

    }
    public  boolean wan(){
        ConnectivityManager connectivityManager= (ConnectivityManager) App.sContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return  activeNetworkInfo.isAvailable();
        }
        return true;
    }
    public void setStartInten(Class<?> clz){
        startActivity(new Intent(this,clz));
    }
    public  void  setToast(String text){
        Toast.makeText(this, text, Toast.LENGTH_SHORT).show();
    }
    protected abstract int initLayout();
    protected abstract void initView();
    protected abstract void initData();



}
