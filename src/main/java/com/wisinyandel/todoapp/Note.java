package com.wisinyandel.todoapp;

import jakarta.persistence.Entity;

import java.util.Date;

public class Note {
    private int id;
    private String Text;
    private Date createdAt;
    private Date estimateCompletionDate;
    private String link;
    private String mentions;
    private int priority;

    public Note(int id, String text, Date createdAt, Date estimateCompletionDate, String link, String mentions, int priority) {
        this.id = id;
        Text = text;
        this.createdAt = createdAt;
        this.estimateCompletionDate = estimateCompletionDate;
        this.link = link;
        this.mentions = mentions;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getEstimateCompletionDate() {
        return estimateCompletionDate;
    }

    public void setEstimateCompletionDate(Date estimateCompletionDate) {
        this.estimateCompletionDate = estimateCompletionDate;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getMentions() {
        return mentions;
    }

    public void setMentions(String mentions) {
        this.mentions = mentions;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", Text='" + Text + '\'' +
                ", createdAt=" + createdAt +
                ", estimateCompletionDate=" + estimateCompletionDate +
                ", link='" + link + '\'' +
                ", mentions='" + mentions + '\'' +
                ", priority=" + priority +
                '}';
    }
}
