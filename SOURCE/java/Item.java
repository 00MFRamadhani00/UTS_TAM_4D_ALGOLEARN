package com.fadhilah.algolearn;

public class Item {
    private String title;
    private String subtitle;

    private String warna;

    private int gambar;
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public int getGambar() { return gambar; }
    public void setGambar(int gambar) { this.gambar = gambar; }

    public String getWarna() {return warna; }

    public void setWarna(String warna) {this.warna = warna; }
}
