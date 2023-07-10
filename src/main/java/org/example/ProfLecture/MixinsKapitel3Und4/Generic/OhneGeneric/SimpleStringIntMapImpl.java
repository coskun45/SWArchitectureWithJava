package org.example.ProfLecture.MixinsKapitel3Und4.Generic.OhneGeneric;

public class SimpleStringIntMapImpl extends SimpleMapImpl{

    public Integer get(String key) {
        Object val = super.get(key);
        if (val == null)
            return null;
        else
            return (Integer) val;
    }
}
