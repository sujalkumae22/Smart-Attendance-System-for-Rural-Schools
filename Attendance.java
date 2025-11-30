package com.school.attendance.model;

public class Attendance {
    private int studentId;
    private String date;
    private boolean present;

    public Attendance(int studentId, String date, boolean present) {
        this.studentId = studentId;
        this.date = date;
        this.present = present;
    }
    public int getStudentId() { return studentId; }
    public String getDate() { return date; }
    public boolean isPresent() { return present; }
}
