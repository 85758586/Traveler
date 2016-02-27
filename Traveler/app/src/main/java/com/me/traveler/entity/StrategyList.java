package com.me.traveler.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyList {
    @SerializedName("errMsg")
    private String mMsg;
    @SerializedName("resultStatus")
    private String mResultStatus;
    @SerializedName("data")
    private List<Strategy> mData;

    public List<Strategy> getData() {
        return mData;
    }

    public void setData(List<Strategy> data) {
        mData = data;
    }

    public String getMsg() {
        return mMsg;
    }

    public void setMsg(String msg) {
        mMsg = msg;
    }

    public String getResultStatus() {
        return mResultStatus;
    }

    public void setResultStatus(String resultStatus) {
        mResultStatus = resultStatus;
    }

    @Override
    public String toString() {
        return "StrategyResponse{" +
                "mData=" + mData +
                ", mMsg='" + mMsg + '\'' +
                ", mResultStatus='" + mResultStatus + '\'' +
                '}';
    }
}
