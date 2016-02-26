package com.me.traveler.http;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.me.traveler.constant.Api;
import com.me.traveler.strategy.IStrategyListApi;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Administrator on 2016/2/27.
 */
public class RetrofitApiProviderImpl<T> implements IRetrofitApiProvider<T> {

    private OkHttpClient mClient;

    public RetrofitApiProviderImpl() {
        new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();
        mClient = new OkHttpClient();
    }

    @Override
    public T getRetrofitApi(Class<T> clazz) {

        return new Retrofit.Builder()
                .baseUrl(Api.SERVER_IP)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(mClient)
                .build()
                .create(clazz);
    }
}
