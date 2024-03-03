package com.example.planetapp;

// this is model class that defines attribute like model of DB
public class Planet {
    // attributes
    private String planetName;
    private String moonCount;
    private int imageResource;

    // constructor
    public Planet(String planetName, String moonCount, int imageResource) {
        this.planetName = planetName;
        this.moonCount = moonCount;
        this.imageResource = imageResource;
    }

    // getter and setter

    public String getPlanetName() {
        return planetName;
    }

    public void setPlanetName(String planetName) {
        this.planetName = planetName;
    }

    public String getMoonCount() {
        return moonCount;
    }

    public void setMoonCount(String moonCount) {
        this.moonCount = moonCount;
    }

    public int getImageResource() {
        return imageResource;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
