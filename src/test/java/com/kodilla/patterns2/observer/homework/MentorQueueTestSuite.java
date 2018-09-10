package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class MentorQueueTestSuite {

    @Test
    public void testUpdate() {
        //Given
        QueueList queueKodilla = new QueueList("Kodilla queue with tasks");
        Mentor mentor = new Mentor("Super Mentor");
        queueKodilla.registerObserver(mentor);

        //When
        queueKodilla.addContent("zadanie 17.4 do sprawdzenie, nic nie dziala, nie wiadomo czxemu :D");

        //Then
        Assert.assertEquals(1 ,mentor.getUpdateCount());
    }
}
