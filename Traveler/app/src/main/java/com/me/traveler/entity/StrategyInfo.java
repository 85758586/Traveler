package com.me.traveler.entity;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyInfo {
    @SerializedName("guides_info_data")
    private List<StrategyDay> mGuidesInfoData;
    @SerializedName("is_collect")
    private String mIsCollect;
    @SerializedName("productName")
    private String mProductName;
    @SerializedName("scenic_code_data")
    private List mScenicCodeData;

    public List<StrategyDay> getGuidesInfoData() {
        return mGuidesInfoData;
    }

    public void setGuidesInfoData(List<StrategyDay> guidesInfoData) {
        mGuidesInfoData = guidesInfoData;
    }

    public String getIsCollect() {
        return mIsCollect;
    }

    public void setIsCollect(String isCollect) {
        mIsCollect = isCollect;
    }

    public String getProductName() {
        return mProductName;
    }

    public void setProductName(String productName) {
        mProductName = productName;
    }

    public List getScenicCodeData() {
        return mScenicCodeData;
    }

    public void setScenicCodeData(List scenicCodeData) {
        mScenicCodeData = scenicCodeData;
    }

    @Override
    public String toString() {
        return "StrategyInfo{" +
                "mGuidesInfoData=" + mGuidesInfoData +
                ", mIsCollect='" + mIsCollect + '\'' +
                ", mProductName='" + mProductName + '\'' +
                ", mScenicCodeData=" + mScenicCodeData +
                '}';
    }
}
