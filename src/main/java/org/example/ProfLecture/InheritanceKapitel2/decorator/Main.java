package org.example.ProfLecture.InheritanceKapitel2.decorator;

public class Main {
    public static void main(String[] args) {
        Payload tp=new TextPayload("Hallo");
       Payload decrypted =new EncryptedPaload(tp);

       Payload inflated=new GzipDecorator(decrypted);
        System.out.println(inflated.getText());
    }
}
