package org.example;

import java.util.Arrays;
import java.util.List;

public class ZipCodeWilmington {
    static Students students = Students.getStudentInstance();
    Instructor instructor;

//    public void hostLecture(Teacher teacher, double numberOfHours){
//        instructor.lecture(students.getStudentInstance());
//    }
//
    public static void getStudyMap(){
        System.out.println(students.getStudentInstance());
    }
//        Arrays.stream(new List[]{List.of(students.getStudentInstance())}).map(student -> student.getTotalStudyTime());

    public static void main(String[] args) {
        getStudyMap();
    }
}

