package org.example.ProfLecture.MixinsKapitel3Und4.Generic.MitGeneric;

public class Main {
    public static void main(String[] args) {
        Map<String, Integer> map = new SimpleMapImpl<>();  // note: type inferred!
        map.put("Hans", 14235);
        Integer i = map.get("Hans");  // > 14235

       // map.put("Peter", "Willi");  // compile time error!
    }
}
