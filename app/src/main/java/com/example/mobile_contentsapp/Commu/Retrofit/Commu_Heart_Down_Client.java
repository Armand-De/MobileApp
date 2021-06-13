package com.example.mobile_contentsapp.Commu.Retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.mobile_contentsapp.Login.Retrofit.NumberClient.BASE_URL;

public class Commu_Heart_Up_Client {

    public static Commu_Heart_Up_Api getApiService(){
        return getInstance().create(Commu_Heart_Up_Api.class);
    }
    private static Retrofit getInstance(){
        Gson gson = new GsonBuilder().setLenient().create();
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
}
