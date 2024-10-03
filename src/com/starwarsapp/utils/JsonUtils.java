package com.starwarsapp.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.starwarsapp.models.Movie;

public abstract class JsonUtils {
    private static Gson gson = new GsonBuilder()
            .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
            .setPrettyPrinting()
            .create();


    public static String toJson(Movie data) {
        return gson.toJson(data);
    }
}
