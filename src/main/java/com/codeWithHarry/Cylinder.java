package com.codeWithHarry;

public class Cylinder {
    int radius;
    int height;
    private final int pi = (int) Math.PI;

    public int getVolume(){
//        π r² h
        return (int) (pi * radius * radius * height);
    }

    public int getSurfaceArea(){
//        2π r h + 2π r²
        return (2 * pi * radius * height) + (2 * pi * radius * radius);
    }
}
