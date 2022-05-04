package com.example.retrofitexample24;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MainInterface {
    @GET("v2/list")
    Call<String> STRING_CALL();
}
