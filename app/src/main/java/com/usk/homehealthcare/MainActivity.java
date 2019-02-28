package com.usk.homehealthcare;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import android.os.Bundle;
import android.util.Log;
import com.usk.homehealthcare.RetrofitPack.RetroGet;
import com.usk.homehealthcare.RetrofitPack.RetrofitDataServer;

import org.json.JSONArray;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    private RetroGet retroGet;
    private String TAG="MainActivityLog";
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.recycleView);
        retroGet= RetrofitDataServer.getRetrofit().create(RetroGet.class);
        Call<String> myData=retroGet.getData("AAK84VY8HXFUQ5EV",3);
        myData.enqueue(new Callback<String>() {
            @Override
            public void onResponse(Call<String> call, Response<String> response) {
                Log.d(TAG,response.body());
                try{
                    JSONObject jsonObject=new JSONObject(response.body());
                    JSONArray jsonArray=jsonObject.getJSONArray("feeds");


                }catch (Exception e)
                {

                }
            }

            @Override
            public void onFailure(Call<String> call, Throwable t) {

            }
        });
    }
}
