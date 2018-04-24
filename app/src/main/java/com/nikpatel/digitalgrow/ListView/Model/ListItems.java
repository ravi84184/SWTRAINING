package com.nikpatel.digitalgrow.ListView.Model;

/**
 * Created by nikpatel on 27/08/17.
 */

public class ListItems {


    private String lan;
    private int img;

    public ListItems(String lan, int img) {
        this.lan = lan;
        this.img = img;
    }


    public String getLan() {
        return lan;
    }

    public void setLan(String lan) {
        this.lan = lan;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
