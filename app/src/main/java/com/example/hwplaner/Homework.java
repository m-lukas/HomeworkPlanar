package com.example.hwplaner;

/**
 * Created by lm-go on 09.04.2017.
 */

public class Homework {

    /**
     * Item text
     */
    @com.google.gson.annotations.SerializedName("id")
    private String mId;

    @com.google.gson.annotations.SerializedName("title")
    private String mTitle;

    @com.google.gson.annotations.SerializedName("groupID")
    private String mGroupID;

    @com.google.gson.annotations.SerializedName("date")
    private String mDate;

    @com.google.gson.annotations.SerializedName("subject")
    private String mSubject;

    /**
     * ToDoItem constructor
     */
    public Homework() {

    }

    @Override
    public String toString() {
        return getTitle();
    }

    public Homework(String id, String groupID, String date, String title, String subject) {
        super();
        this.mId = id;
        this.mGroupID = groupID;
        this.mDate = date;
        this.mTitle = title;
        this.mSubject = subject;
    }

    public String getGroupID() {
        return this.mGroupID;
    }

    public String getId() {
        return this.mId;
    }

    public String getDate() {
        return this.mDate;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getSubject() {
        return this.mSubject;
    }

    public void setGroupID(String groupID) {
        this.mGroupID = groupID;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public void setDate(String date) {
        this.mDate = date;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setSubject(String subject) {
        this.mSubject = subject;
    }

}
