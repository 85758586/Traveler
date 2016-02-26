package com.me.traveler.strategy;

/**
 * Created by Administrator on 2016/2/26.
 */
public class StrategyListRequest {
    private int page_index;
    private int page_size;
    private String member_id ="";
    private String search_key = "";

    public StrategyListRequest(int page_index, int page_size){
        this.page_index = page_index;
        this.page_size = page_size;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    public int getPage_index() {
        return page_index;
    }

    public void setPage_index(int page_index) {
        this.page_index = page_index;
    }

    public int getPage_size() {
        return page_size;
    }

    public void setPage_size(int page_size) {
        this.page_size = page_size;
    }

    public String getSearch_key() {
        return search_key;
    }

    public void setSearch_key(String search_key) {
        this.search_key = search_key;
    }

    @Override
    public String toString() {
        return "{" +
                "page_index:" + page_index +
                ", page_size:" + page_size +
                ", member_id:\"" + member_id + '\"' +
                ", search_key:\"" + search_key + '\"' +
                "}";
    }
}
