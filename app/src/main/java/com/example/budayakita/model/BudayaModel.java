package com.example.budayakita.model;

public class BudayaModel {
    private String title, desc, provinsi;
    private int[] galleries;

    public BudayaModel(String title, String desc, String provinsi, int[] galleries) {
        this.title = title;
        this.desc = desc;
        this.provinsi = provinsi;
        this.galleries = galleries;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getProvinsi() {
        return provinsi;
    }

    public void setProvinsi(String provinsi) {
        this.provinsi = provinsi;
    }

    public int[] getGalleries() {
        return galleries;
    }

    public void setGalleries(int[] galleries) {
        this.galleries = galleries;
    }
}
