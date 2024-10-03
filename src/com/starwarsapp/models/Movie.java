package com.starwarsapp.models;

import com.starwarsapp.utils.MovieSWAPI;

public class Movie {
    private String title;
    private String plot;
    private String director;
    private String producer;
    private String releaseDate;

    public Movie() {
    }

    public Movie(String title, String plot, String director, String producer, String releaseDate) {
        this.title = title;
        this.plot = plot;
        this.director = director;
        this.producer = producer;
        this.releaseDate = releaseDate;
    }

    public Movie(MovieSWAPI movieSWAPI) {
        this.title = movieSWAPI.title();
        this.plot = movieSWAPI.opening_crawl();
        this.director = movieSWAPI.director();
        this.producer = movieSWAPI.producer();
        this.releaseDate = movieSWAPI.release_date();
    }

    public String getTitle() {
        return title;
    }

    public String getPlot() {
        return plot;
    }

    public String getDirector() {
        return director;
    }

    public String getProducer() {
        return producer;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    @Override
    public String toString() {
        return "{" +
                "title='" + title + '\'' +
                ", plot='" + plot.substring(0, 50) + "..." + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
