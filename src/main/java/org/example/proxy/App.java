package org.example.proxy;

import java.math.BigDecimal;

public class App {
    public static void main(String[] args) {
        YoneticiProxy yoneticiProxy=new YoneticiProxy("bahadir","123");

        BigDecimal ciro=null;

        try{
            ciro=yoneticiProxy.getCiro();
            System.out.println("Sirket Cirosu:"+ciro);

        }catch (IllegalAccessException e){
            System.out.println("hassa bilgilere erisiminiz yok");
        }
    }
}
