package com.me.traveler.strategy;

/**
 * Created by Administrator on 2016/2/27.
 */
public class StrategyDetailRequest {
    private String member_id = "";
    private String guides_id;

    public StrategyDetailRequest(String member_id, String guides_id){
        this.member_id = member_id;
        this.guides_id = guides_id;
    }

    public String getGuides_id() {
        return guides_id;
    }

    public void setGuides_id(String guides_id) {
        this.guides_id = guides_id;
    }

    public String getMember_id() {
        return member_id;
    }

    public void setMember_id(String member_id) {
        this.member_id = member_id;
    }

    @Override
    public String toString() {
        return "{" +
                "member_id:\"" + member_id + '\"' +
                ", guides_id:\"" + guides_id + '\"' +
                '}';
    }
}
