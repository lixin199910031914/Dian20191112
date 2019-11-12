package com.bawei.dian20191112.loginuser.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.bawei.dian20191112.R;
import com.bawei.dian20191112.base.IBaseActivty;
import com.bawei.dian20191112.entity.LoginEntity;
import com.bawei.dian20191112.entity.RegisterEntity;
import com.bawei.dian20191112.loginuser.contract.LoginContract;

public class LoginActivity extends IBaseActivty implements LoginContract.Iview {


    @Override
    protected int initLayout() {
        return R.layout.loginactivity_main;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    public void onRegisterCheng(RegisterEntity registerEntity) {

    }

    @Override
    public void onLoginCheng(LoginEntity loginEntity) {

    }

    @Override
    public void onShiBai(String meg) {

    }
}
