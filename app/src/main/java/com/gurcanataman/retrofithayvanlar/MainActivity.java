package com.gurcanataman.retrofithayvanlar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.gson.Gson;
import com.gurcanataman.retrofithayvanlar.api.Animals;
import com.gurcanataman.retrofithayvanlar.api.ApiClient;
import com.gurcanataman.retrofithayvanlar.api.Model;
import com.gurcanataman.retrofithayvanlar.api.RetrofitGetData;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RetrofitGetData retrofitGetData = ApiClient.getApiClient().create(RetrofitGetData.class);
        Call<Model> call = retrofitGetData.getModelData();

        // Gelen cevabı parse ediyoruz:
        call.enqueue(new Callback<Model>() {
            @Override
            public void onResponse(Call<Model> call, Response<Model> response) {
                if (response.body()!=null){
                    Log.e("GELEN JSON", ""+new Gson().toJson(response.body()));
                    //Gelen jsonu model sınıfımıza atıyoruz.
                    Model model = response.body();
                    Log.e("Model id:",""+model.getId());
                    Log.e("Model Name:",""+model.getName());

                    Animals animals = model.getAnimals();

                    Log.e("1. Hayvan:",animals.getFirst().getName());
                    Log.e("2. Hayvan:",animals.getSecond().getName());
                    Log.e("3. Hayvan:",animals.getThird().getName());
                    Log.e("4. Hayvan:",animals.getFourth().getName());

                }


            }

            @Override
            public void onFailure(Call<Model> call, Throwable t) {
                Log.e("HATA", ""+t.getLocalizedMessage());


            }
        });
    }
}
