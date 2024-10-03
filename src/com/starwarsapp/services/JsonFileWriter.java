package com.starwarsapp.services;

import com.starwarsapp.models.Movie;
import com.starwarsapp.utils.JsonUtils;

import java.io.FileWriter;
import java.io.IOException;

public class JsonFileWriter {

    public static void saveMovieToFile(String filePath, Movie movie) throws IOException {
        FileWriter writer = new FileWriter(filePath + ".json");
        writer.write(JsonUtils.toJson(movie));
        writer.close();
    }
}
