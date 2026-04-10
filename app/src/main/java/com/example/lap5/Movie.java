package com.example.lap5;

public class Movie {
    private String id;
    private String title;
    private String genre;
    private String posterUrl;

    // Firebase needs an empty constructor
    public Movie() {}

    public Movie(String title, String genre, String posterUrl) {
        this.title = title;
        this.genre = genre;
        this.posterUrl = posterUrl;
    }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public String getPosterUrl() { return posterUrl; }
}
