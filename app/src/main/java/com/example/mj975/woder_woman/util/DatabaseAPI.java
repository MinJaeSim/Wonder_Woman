package com.example.mj975.woder_woman.util;

import com.example.mj975.woder_woman.data.Event;
import com.example.mj975.woder_woman.data.Toilet;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface DatabaseAPI {
    @GET("event/all")
    Call<ArrayList<Event>> getAllEvents();

    @GET("toilet/all")
    Call<ArrayList<Toilet>> getAllToilets();
}
