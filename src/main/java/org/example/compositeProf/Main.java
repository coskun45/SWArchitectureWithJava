package org.example.compositeProf;

public class Main {
    public static void main(String[] args) {
        Box b=new Box();
        b.objects=new Shipment[]{new Shirt(),new Shoes(),new Box()};
       ((Box) b.objects[2]).objects=new Shipment[]{new Shirt()};
        System.out.println(b.count());
    }
}
