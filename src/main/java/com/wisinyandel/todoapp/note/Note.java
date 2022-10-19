package com.wisinyandel.todoapp.note;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "notes")
public class Note {
    @Id
    private int id;
    private String Text;
    @Column(name = "created_at")
    private Date createdAt;
    @Column(name = "estimated_completion_date")
    private Date estimatedCompletionDate;
    private String link;
    private String mentions;
    private int priority;

    public Note() {}

    public Note(int id, String text, Date createdAt, Date estimatedCompletionDate, String link, String mentions, int priority) {
        this.id = id;
        Text = text;
        this.createdAt = createdAt;
        this.estimatedCompletionDate = estimatedCompletionDate;
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
        return estimatedCompletionDate;
    }

    public void setEstimateCompletionDate(Date estimatedCompletionDate) {
        this.estimatedCompletionDate = estimatedCompletionDate;
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
                ", estimatedCompletionDate=" + estimatedCompletionDate +
                ", link='" + link + '\'' +
                ", mentions='" + mentions + '\'' +
                ", priority=" + priority +
                '}';
    }
}
