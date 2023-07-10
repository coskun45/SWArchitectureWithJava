package org.example.ProfLecture.MixinsKapitel3Und4.Generic.MitGeneric;

public class SimpleMapImpl<K, V> implements Map<K, V> {
    class Entry {
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
        K key;
        V value;
        Entry next;
    }

    Entry head;

    @Override
    public void put(K key, V value) {
        // ...
    }

    @Override
    public V get(K key) {
        // ...
        return null;
    }
}
