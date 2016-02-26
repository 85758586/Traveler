package com.me.traveler.strategy;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.me.traveler.constant.Api;
import com.me.traveler.entity.Ticket;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetailService {
    private IStrategyDetailApi mService;

    public StrategyDetailService(){
        new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();
        OkHttpClient client = new OkHttpClient();
        mService = new Retrofit.Builder()
                .baseUrl(Api.SERVER_IP)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(client)
                .build()
                .create(IStrategyDetailApi.class);
    }

    public Observable<Ticket> getStrategyDetail(String request){
        return mService.getStrategyDetail(request);
    }
}
