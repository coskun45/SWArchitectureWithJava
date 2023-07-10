package org.example.ProfLecture.MixinsKapitel3Und4.Generic.OhneGeneric;

public class SimpleMapImpl implements Map{
    private class Entry {
        Entry(Object key, Object value) {
            this.key = key;
            this.value = value;
        }
        Object key;
        Object value;
        Entry next;
    }
    private Entry head;

    @Override
    public void put(Object key, Object value) {
        if (head == null) {
            head = new Entry(key, value);  // easy: first Entry in
            return;
        }

        Entry it = head, prev = null;
        while (it!= null) {
            if (it.key.equals(key)) {  // key exists, update value
                it.value = value;
                return;
            }
            prev = it;
            it = it.next;
        }

        prev.next = new Entry(key, value);  // append at the end
    }
    @Override
    public Object get(Object key) {
        Entry it = head;
        while (it != null) {
            if (it.key.equals(key))  // found it!
                return it.value;
            it = it.next;
        }

        return null;  // no value for this key
    }
}
