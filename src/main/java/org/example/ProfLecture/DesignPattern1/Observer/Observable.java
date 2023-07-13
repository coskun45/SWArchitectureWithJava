package org.example.ProfLecture.DesignPattern1.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> list;

    public Observable() {
        list=new ArrayList<>();
    }

    public void addObserver(Observer o){
        list.add(o);
    }
    public void deleteObserver(Observer o){
        list.remove(o);
    }
    public  void haberVer(){
        for(Observer o:list){
            o.update(this);

        }

    }

}
