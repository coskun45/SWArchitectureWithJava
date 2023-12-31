package org.example.mixin2.son;

public interface Stateful {
    <T> T getState(Class clazz, T initial);
    <T> void setState(Class clazz, T state);
}
