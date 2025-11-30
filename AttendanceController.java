package com.school.attendance.controller;

import com.school.attendance.model.Attendance;
import com.school.attendance.model.Student;
import com.school.attendance.service.AttendanceService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")   // Allow mobile browser access
@RequestMapping("/api")
public class AttendanceController {

    @Autowired
    AttendanceService service;

    @GetMapping("/students")
    public List<Student> getStudents() {
        return service.getStudents();
    }

    @PostMapping("/attendance")
    public String markAttendance(@RequestBody List<Attendance> attendance) {
        service.saveAttendance(attendance);
        return "Attendance Saved!";
    }

    @GetMapping("/attendance")
    public List<Attendance> allAttendance() {
        return service.getAttendance();
    }
}
