package com.kodilla.patterns2.observer.homework;


public class Mentor implements Observer{

    private final String mentorName;
    private int updateCount;

    public Mentor(String mentorName) {
        this.mentorName = mentorName;
    }
    @Override
    public void update(QueueList queueList){
        System.out.println(mentorName + ": New content in topic " + queueList.getName() + "\n" + " (total: " + queueList.getContents().size() + " contents");
        updateCount++;
    }

    public String getUsername() {
        return mentorName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
