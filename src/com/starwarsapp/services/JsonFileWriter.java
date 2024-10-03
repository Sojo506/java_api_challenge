package com.starwarsapp.services;

import com.google.gson.Gson;
import com.starwarsapp.models.Movie;
import com.starwarsapp.utils.JsonUtils;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {

    public static void saveMovieToFile(String filePath, Movie movie) throws IOException {
        Gson gson = JsonUtils.getGson();

        FileWriter writer = new FileWriter(filePath + ".json");
        writer.write(gson.toJson(movie));
        writer.close();
    }
}
