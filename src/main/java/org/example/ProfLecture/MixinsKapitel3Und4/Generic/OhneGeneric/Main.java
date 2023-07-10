package org.example.ProfLecture.MixinsKapitel3Und4.Generic.OhneGeneric;

public class Main {
    public static void main(String[] args) {
        Map map = new SimpleMapImpl();

        // the type conversion to Object is automatic
        map.put("Grummel Griesgram", 143212);
        map.put("Regina Regenbogen", 412341);

        // since the return type is Object, explicit type conversion is required
        Integer grummel = (Integer) map.get("Grummel Griesgram");    // > 143212
        Integer schleichmichl = (Integer) map.get("Schleichmichl");  // > null
        // sorun: return type obj oldugu icin cast etmek gerekiyor sürekli

        // lösung1: type spezifische implemantation
        SimpleStringIntMapImpl map2 = new SimpleStringIntMapImpl();
        map.put("Hans", 14235);
        Integer hans = map2.get("Hans");  // return type ist sicher integer


        //SORUN:
        Map map3 = new SimpleStringIntMapImpl();  // nota bene: Map!
        map3.put("Schleichmichl3", "DROP TABLE matrikel");
        //Integer schleichmichl2 = map3.get("Schleichmichl");
    }
}
