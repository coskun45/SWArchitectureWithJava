package org.example.ProfLecture.InheritanceKapitel2.LiskovPrinsip;

public class Square extends  Rectangle{
    Square(int x, int y, int w) {
        super(x, y, w, w);
    }
    void setWidth(int w) {
        super.setWidth(w);
        super.setHeight(w);
    }
    void setHeight(int w) {
        setWidth(w);
    }
}
