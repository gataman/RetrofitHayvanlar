package com.gurcanataman.retrofithayvanlar.api;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitGetData {
    @GET("test_json.php")
    Call<Model> getModelData();
}
