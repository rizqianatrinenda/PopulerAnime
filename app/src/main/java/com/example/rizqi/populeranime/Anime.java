package com.example.rizqi.populeranime;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Anime implements Parcelable {

    private String judulAnime;
    private String pengarangAnime;
    private String jumlahEpisode;
    private String sinopsisAnime;
    private String idGambarAnime;

    public Anime(String judulAnime, String pengarangAnime, String jumlahEpisode, String sinopsisAnime, String idGambarAnime) {
        this.judulAnime = judulAnime;
        this.pengarangAnime = pengarangAnime;
        this.jumlahEpisode = jumlahEpisode;
        this.sinopsisAnime = sinopsisAnime;
        this.idGambarAnime = idGambarAnime;
    }

    public String getJudulAnime() {
        return judulAnime;
    }

    public void setJudulAnime(String judulAnime) {
        this.judulAnime = judulAnime;
    }

    public String getPengarangAnime() {
        return pengarangAnime;
    }

    public void setPengarangAnime(String pengarangAnime) {
        this.pengarangAnime = pengarangAnime;
    }

    public String getJumlahEpisode() {
        return jumlahEpisode;
    }

    public void setJumlahEpisode(String jumlahEpisode) {
        this.jumlahEpisode = jumlahEpisode;
    }

    public String getSinopsisAnime() {
        return sinopsisAnime;
    }

    public void setSinopsisAnime(String sinopsisAnime) {
        this.sinopsisAnime = sinopsisAnime;
    }

    public String getIdGambarAnime() {
        return idGambarAnime;
    }

    public void setIdGambarAnime(String idGambarAnime) {
        this.idGambarAnime = idGambarAnime;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.judulAnime);
        dest.writeString(this.pengarangAnime);
        dest.writeString(this.jumlahEpisode);
        dest.writeString(this.sinopsisAnime);
        dest.writeString(this.idGambarAnime);
    }

    protected Anime(Parcel in) {
        this.judulAnime = in.readString();
        this.pengarangAnime = in.readString();
        this.jumlahEpisode = in.readString();
        this.sinopsisAnime = in.readString();
        this.idGambarAnime = in.readString();
    }

    public static final Creator<Anime> CREATOR = new Creator<Anime>() {
        @Override
        public Anime createFromParcel(Parcel source) {
            return new Anime(source);
        }

        @Override
        public Anime[] newArray(int size) {
            return new Anime[size];
        }
    };
}
