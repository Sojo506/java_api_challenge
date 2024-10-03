package com.starwarsapp.utils;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class JsonUtils {
    private static final Gson gson = new GsonBuilder()
            .setPrettyPrinting()
            .create();

    public static Gson getGson() {
        return gson;
    }
}
