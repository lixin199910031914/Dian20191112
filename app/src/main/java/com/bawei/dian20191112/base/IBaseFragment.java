package com.bawei.dian20191112.base;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bawei.dian20191112.app.App;


public abstract class IBaseFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        if (layout()!=0){
            view = inflater.inflate(layout(), null);
            initView(view);
            initData();
        }

        return view;
    }

    protected abstract void initData();

    protected abstract void initView(View view);

    protected abstract int layout();

    public  boolean wan(){
        ConnectivityManager connectivityManager= (ConnectivityManager) App.sContext.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null) {
            return  activeNetworkInfo.isAvailable();
        }
        return true;
    }
    public void setStartInten(Class<?> clz){
        startActivity(new Intent(getContext(),clz));
    }
    public  void  setToast(String text){
        Toast.makeText(getContext(), text, Toast.LENGTH_SHORT).show();
    }
}
