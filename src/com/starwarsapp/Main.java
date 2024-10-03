package com.starwarsapp;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.starwarsapp.api.SWAPIClient;
import com.starwarsapp.models.Movie;
import com.starwarsapp.utils.JsonUtils;
import com.starwarsapp.utils.MovieSWAPI;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Gson gson = JsonUtils.getGson();

        String json = SWAPIClient.getData("2");
        MovieSWAPI movieSWAPI = gson.fromJson(json, MovieSWAPI.class);
        Movie movie = new Movie(movieSWAPI);
        System.out.println("movie = " + movie);
    }
}
