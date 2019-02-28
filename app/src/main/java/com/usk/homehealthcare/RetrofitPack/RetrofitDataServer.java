package com.usk.homehealthcare.RetrofitPack;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetrofitDataServer {
    public static final String BASE_URL = "https://api.thingspeak.com/channels/666223/";

    public static Retrofit retro = null;

    public static Retrofit getRetrofit() {
        if (retro == null) {
            retro = new Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(ScalarsConverterFactory.create()).addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retro;
    }
}