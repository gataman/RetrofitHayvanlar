
package com.gurcanataman.retrofithayvanlar.api;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Third {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("familia")
    @Expose
    private String familia;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

}
