package com.me.traveler.http;

/**
 * Created by Administrator on 2016/2/27.
 */
public interface IRetrofitApiProvider<T> {
    T getRetrofitApi(Class<T> clazz);
}
