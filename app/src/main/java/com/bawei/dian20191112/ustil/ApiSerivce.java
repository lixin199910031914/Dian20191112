package com.bawei.dian20191112.ustil;


import com.bawei.dian20191112.entity.LoginEntity;
import com.bawei.dian20191112.entity.RegisterEntity;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.POST;

public interface ApiSerivce {
//http://172.17.8.100/small/user/v1/login
    @POST("user/v1/login")
    Observable<RegisterEntity> register(@Field("phone") String phone, @Field("pwd") String pwd);
    //http://172.17.8.100/small/user/v1/register
    @POST("user/v1/register")
    Observable<LoginEntity> login(@Field("phone") String phone, @Field("pwd") String pwd);
}
