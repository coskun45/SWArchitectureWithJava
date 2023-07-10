package org.example.ProfLecture.InheritanceKapitel2.LiskovPrinsip;

import java.awt.*;

public class Rectangle extends Shape implements Drawable{
    private int width, height;
    Rectangle(int x, int y, int w, int h) {
        super(x, y);
        width = w;
        height = h;
    }
    void setWidth(int w) { width = w; }
    void setHeight(int h) { height = h; }
    int getWidth() { return width; }
    int getHeight() { return height; }
    public void draw(Canvas c) { /* do some magic */ }
    }

