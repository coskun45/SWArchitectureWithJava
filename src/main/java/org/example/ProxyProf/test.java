package org.example.ProxyProf;

public class test {

    public static void main(String[] args) {
        double F,y,sum,k,x,old;
        F=10000;
        y=1*F;
        sum=1*F;
        k=1*F;
        x=1*F;
        do{
            old=sum;
            y=y*x/k;
            sum=sum+y;
            k=k+F;

        }while (old!=sum);

        System.out.println(sum);
    }
}
