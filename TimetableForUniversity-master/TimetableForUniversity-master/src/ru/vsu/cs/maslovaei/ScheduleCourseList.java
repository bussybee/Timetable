package ru.vsu.cs.maslovaei;

import java.util.HashMap;
import java.util.Map;

public class ScheduleCourseList {
    StudentList studentList = new StudentList();
    SubjectList subjectList = new SubjectList();

    public ScheduleCourseList(StudentList studentList) {
        Subject[] subjects1 = {subjectList.subject1, subjectList.subject2, subjectList.subject3, subjectList.subject4};
        Subject[] subjects2 = {subjectList.subject3, subjectList.subject5, subjectList.subject8, subjectList.subject2};
        Subject[] subjects3 = {subjectList.subject6, subjectList.subject9, subjectList.subject10, subjectList.subject7};
        Subject[] subjects4 = {subjectList.subject4, subjectList.subject6, subjectList.subject7, subjectList.subject10};
        Subject[] subjects5 = {subjectList.subject1, subjectList.subject5, subjectList.subject8, subjectList.subject9};

    }
}
