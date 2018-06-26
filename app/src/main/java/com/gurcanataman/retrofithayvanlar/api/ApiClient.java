package com.gurcanataman.retrofithayvanlar.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static Retrofit retrofit=null;
    public static String BASE_URL = "https://teachpad.app/";



    public static Retrofit getApiClient(){
        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        if(retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }
}
