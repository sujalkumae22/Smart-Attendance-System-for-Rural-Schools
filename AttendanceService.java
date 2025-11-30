package com.school.attendance.service;

import com.school.attendance.model.Student;
import com.school.attendance.model.Attendance;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class AttendanceService {

    private static List<Student> students = new ArrayList<>();
    private static List<Attendance> attendanceList = new ArrayList<>();

    static {
        students.add(new Student(1, "Ravi Kumar", "Class 5"));
        students.add(new Student(2, "Meena Devi", "Class 5"));
        students.add(new Student(3, "Arun Patel", "Class 5"));
    }

    public List<Student> getStudents() {
        return students;
    }

    public void saveAttendance(List<Attendance> att) {
        attendanceList.addAll(att);
    }

    public List<Attendance> getAttendance() {
        return attendanceList;
    }
}
