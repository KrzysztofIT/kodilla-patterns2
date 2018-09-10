package com.kodilla.patterns2.observer.homework;


import java.util.ArrayList;
import java.util.List;

public class QueueList implements Observable {

    private final String name;
    private final List<String> contents;
    private final List<Observer> observers;


    public QueueList(String name  ) {
        this.name = name;
        contents = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addContent(String content){
        contents.add(content);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public List<String> getContents() {
        return contents;
    }

    public String getName() {
        return name;
    }
}
