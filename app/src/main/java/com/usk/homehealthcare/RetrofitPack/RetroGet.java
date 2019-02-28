package com.usk.homehealthcare.RetrofitPack;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface RetroGet {
    @GET("feeds.json")
    Call<String> getData(@Query("api_key") String key, @Query("results") int q);
}
