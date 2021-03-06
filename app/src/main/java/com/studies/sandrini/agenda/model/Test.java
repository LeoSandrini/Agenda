package com.studies.sandrini.agenda.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Sandrini on 19/10/2017.
 */

public class Test implements Serializable {
    private String subject;
    private String date;
    private List<String> topics;

    public Test(String subject, String date, List<String> topics) {
        this.subject = subject;
        this.date = date;
        this.topics = topics;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<String> getTopics() {
        return topics;
    }

    public void setTopics(List<String> topics) {
        this.topics = topics;
    }

    @Override
    public String toString() {
        return this.subject;
    }
}
