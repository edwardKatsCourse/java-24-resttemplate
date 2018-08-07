package com.company;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ResponseResult {

    //constructors: default and all-included
    //getters and setters
    //toString
    private String kind; //knd
    private String artistName;
    private String trackId;
    private String collectionId;




    public ResponseResult() {
    }

    @Override
    public String toString() {
        return "\nResponseResult{" +
                "kind='" + kind + '\'' +
                ", artistName='" + artistName + '\'' +
                ", trackId='" + trackId + '\'' +
                ", collectionId='" + collectionId + '\'' +
                '}';
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    public String getTrackId() {
        return trackId;
    }

    public void setTrackId(String trackId) {
        this.trackId = trackId;
    }

    public String getCollectionId() {
        return collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public ResponseResult(String kind, String artistName, String trackId, String collectionId) {
        this.kind = kind;
        this.artistName = artistName;
        this.trackId = trackId;
        this.collectionId = collectionId;
    }
}
