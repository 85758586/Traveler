package com.me.traveler.strategy;

import com.facebook.stetho.okhttp3.StethoInterceptor;
import com.me.traveler.constant.Api;
import com.me.traveler.entity.StrategyResponse;
import com.me.traveler.http.RetrofitApiProviderImpl;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyListService {

    private IStrategyListApi mService;
    private RetrofitApiProviderImpl<IStrategyListApi> mApiProvider;

    public StrategyListService(){
//        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
//        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
//        new OkHttpClient.Builder().addNetworkInterceptor(new StethoInterceptor()).build();
//        OkHttpClient client = new OkHttpClient();
//        mService = new Retrofit.Builder()
//                .baseUrl(Api.SERVER_IP)
//                .addConverterFactory(GsonConverterFactory.create())
//                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
//                .client(client)
//                .build()
//                .create(IStrategyListApi.class);
        mApiProvider = new RetrofitApiProviderImpl<>();
        mService = mApiProvider.getRetrofitApi(IStrategyListApi.class);
    }

    public Observable<StrategyResponse> getStrategyList(String request) {
        return mService.getStrategyList(request);
    }
}
