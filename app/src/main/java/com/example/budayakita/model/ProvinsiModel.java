package com.example.budayakita.model;

public class ProvinsiModel {
    private int id;
    private String nama, warna_bg;
    private int gambar;

    public ProvinsiModel(int id, String nama, String warna_bg, int gambar) {
        this.id = id;
        this.nama = nama;
        this.warna_bg = warna_bg;
        this.gambar = gambar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getWarna_bg() {
        return warna_bg;
    }

    public void setWarna_bg(String warna_bg) {
        this.warna_bg = warna_bg;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }
}
