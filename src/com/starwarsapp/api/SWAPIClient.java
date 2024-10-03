package com.starwarsapp.api;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public abstract class SWAPIClient {
    private static String url = "https://swapi.py4e.com/api/films/%s/?format=json";

    public static String getData(String index) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(String.format(url, index)))
                .build();
        System.out.println("request = " + request);
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("response = " + response);

        String json = response.body();
        System.out.println("JSON: " + json);
        return json;
    }
}
