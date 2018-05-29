package models;

import java.util.ArrayList;

public class CD {
    private String title;
    private String artist;
    private int year;
    private String genre;
    private static ArrayList<CD> collection = new ArrayList<>();

    public CD (String title, String artist, int year, String genre){
        this.title = title;
        this.artist = artist;
        this.year = year;
        this. genre = genre;
        collection.add(this);
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

    public static ArrayList<CD> getAll(){
        return collection;
    }


}
