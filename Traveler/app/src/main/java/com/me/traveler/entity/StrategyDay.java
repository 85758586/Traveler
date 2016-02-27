package com.me.traveler.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDay {
    @SerializedName("data")
    private List<StrategyIntro> mStrategyIntro;
    @SerializedName("trip_city_name")
    private String mTripCityName = "";
    @SerializedName("trip_day")
    private String mTripDay;

    public List<StrategyIntro> getStrategyIntro() {
        return mStrategyIntro;
    }

    public void setStrategyIntro(List<StrategyIntro> strategyIntro) {
        mStrategyIntro = strategyIntro;
    }

    public String getTripCityName() {
        return mTripCityName;
    }

    public void setTripCityName(String tripCityName) {
        mTripCityName = tripCityName;
    }

    public String getTripDay() {
        return mTripDay;
    }

    public void setTripDay(String tripDay) {
        mTripDay = tripDay;
    }

    @Override
    public String toString() {
        return "StrategyDay{" +
                "mStrategyIntro=" + mStrategyIntro +
                ", mTripCityName='" + mTripCityName + '\'' +
                ", mTripDay='" + mTripDay + '\'' +
                '}';
    }
}
