package com.bawei.dian20191112.ustil;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitUstil {
    //私有属性
    private static RetrofitUstil refioUstil;
    private final OkHttpClient okHttpClient;
    private final Retrofit retrofit;

    private RetrofitUstil(){
        okHttpClient = new OkHttpClient.Builder()
                .writeTimeout(20, TimeUnit.SECONDS)
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
                .build();
        retrofit = new Retrofit.Builder()
                .client(okHttpClient)
                .baseUrl("http://172.17.8.100/small")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//请求适配器
                .addConverterFactory(GsonConverterFactory.create())//数据转换器
                .build();
    }
    public static RetrofitUstil getInstance(){
        if (refioUstil==null){
            synchronized (RetrofitUstil.class){
                if (refioUstil==null){
                refioUstil=new RetrofitUstil();
                }
            }
        }
        return refioUstil;
    }
    public  <T> T setApiSerice(Class<T> clz){
        return  retrofit.create(clz);
    }
}
