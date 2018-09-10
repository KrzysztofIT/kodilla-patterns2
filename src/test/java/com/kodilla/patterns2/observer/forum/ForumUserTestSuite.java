package com.kodilla.patterns2.observer.forum;

import org.junit.Assert;
import org.junit.Test;

public class ForumUserTestSuite {
    @Test
    public void testUpdate() {
        //Given
        ForumTopic javaHelpForum = new JavaHelpForumTopic();
        ForumTopic javaToolsForum = new JavaToolsForumTopic();
        ForumUser johnSmith = new ForumUser("John Smith");
        ForumUser ivoneEscobar = new ForumUser("Ivone Escobar");
        ForumUser jessiePinkman = new ForumUser("Jessie Pinkman");
        javaHelpForum.registerObserver(johnSmith);
        javaToolsForum.registerObserver(ivoneEscobar);
        javaHelpForum.registerObserver(jessiePinkman);
        javaToolsForum.registerObserver(jessiePinkman);

        //When
        javaHelpForum.addPost("post 1");
        javaHelpForum.addPost("post 2");
        javaHelpForum.addPost("post 3");
        javaToolsForum.addPost("post 1a");
        javaToolsForum.addPost("post 2a");

        //Then
        Assert.assertEquals(3 ,johnSmith.getUpdateCount());
        Assert.assertEquals(2 ,ivoneEscobar.getUpdateCount());
        Assert.assertEquals(5 ,jessiePinkman.getUpdateCount());

    }
}
