package ru.vsu.cs.maslovaei;

import java.util.ArrayList;
import java.util.List;

public class Main {

    static StudentList studentList = new StudentList();
    static SubjectList subjectList = new SubjectList();
    static TeacherList teacherList = new TeacherList();


    static List<Student> students = new ArrayList<>();
    static List<Subject> subjects = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {
        Menu menu = new Menu();

        studentList.addNewStudents(students);
        subjectList.addNewSubjects(subjects);
        teacherList.addNewTeachers(teachers);

        menu.start();

    }







}
