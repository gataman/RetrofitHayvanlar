
package com.gurcanataman.retrofithayvanlar.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Animals {

    @SerializedName("first")
    @Expose
    private First first;
    @SerializedName("second")
    @Expose
    private Second second;
    @SerializedName("third")
    @Expose
    private Third third;
    @SerializedName("fourth")
    @Expose
    private Fourth fourth;

    public First getFirst() {
        return first;
    }

    public void setFirst(First first) {
        this.first = first;
    }

    public Second getSecond() {
        return second;
    }

    public void setSecond(Second second) {
        this.second = second;
    }

    public Third getThird() {
        return third;
    }

    public void setThird(Third third) {
        this.third = third;
    }

    public Fourth getFourth() {
        return fourth;
    }

    public void setFourth(Fourth fourth) {
        this.fourth = fourth;
    }

}
