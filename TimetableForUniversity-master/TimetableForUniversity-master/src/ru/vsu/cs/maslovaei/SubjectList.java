package ru.vsu.cs.maslovaei;

import java.util.ArrayList;
import java.util.List;

public class SubjectList {
    TeacherList teacherList = new TeacherList();
    
    private List<Subject> subjectList = new ArrayList<>();
    Subject subject1 = new Subject("Русский язык", teacherList.teacher1);
    Subject subject2 = new Subject("Математика", teacherList.teacher2);
    Subject subject3 = new Subject("Физика", teacherList.teacher2);
    Subject subject4 = new Subject("Биология", teacherList.teacher3);
    Subject subject5 = new Subject("Химия", teacherList.teacher3);
    Subject subject6 = new Subject("Природоведение", teacherList.teacher3);
    Subject subject7 = new Subject("Родная речь", teacherList.teacher5);
    Subject subject8 = new Subject("Базы данных", teacherList.teacher4);
    Subject subject9 = new Subject("Системное администрирование", teacherList.teacher4);
    Subject subject10 = new Subject("Философия", teacherList.teacher1);

    public void addNewSubjects(List<Subject> list) {
        list.add(subject1);
        list.add(subject2);
        list.add(subject3);
        list.add(subject4);
        list.add(subject5);
        list.add(subject6);
        list.add(subject7);
        list.add(subject8);
        list.add(subject9);
        list.add(subject10);
    }

}
