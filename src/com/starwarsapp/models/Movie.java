package com.starwarsapp.models;

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
                ", plot='" + plot + '\'' +
                ", director='" + director + '\'' +
                ", producer='" + producer.substring(0, 10) + "..." + '\'' +
                ", releaseDate='" + releaseDate + '\'' +
                '}';
    }
}
