package com.kthdv.adviserapp.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class StudentForm {
    @SerializedName("studentID")
    @Expose
    private String studentID;
    @SerializedName("studentName")
    @Expose
    private String studentName;
    @SerializedName("studentUsername")
    @Expose
    private String studentUsername;
    @SerializedName("lastModified")
    @Expose
    private long lastModified;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentUsername() {
        return studentUsername;
    }

    public void setStudentUsername(String studentUsername) {
        this.studentUsername = studentUsername;
    }

    public long getLastModified() {
        return lastModified;
    }

    public void setLastModified(long lastModified) {
        this.lastModified = lastModified;
    }
}
