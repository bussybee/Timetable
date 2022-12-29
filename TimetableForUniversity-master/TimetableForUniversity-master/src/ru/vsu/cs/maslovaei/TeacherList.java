package ru.vsu.cs.maslovaei;

import java.util.ArrayList;
import java.util.List;

public class TeacherList {
    private List<Teacher> teacherList = new ArrayList<>();

   Teacher teacher1 = new Teacher("Черёмухина", "Снежана", "Павловна");
   Teacher teacher2 = new Teacher("Суворов", "Валентин", "Фёдорович");
   Teacher teacher3 = new Teacher("Шишкина", "Светлана", "Валерьевна");
   Teacher teacher4 = new Teacher("Шеногина", "Алина", "Юрьевна");
   Teacher teacher5 = new Teacher("Пуговкина", "Василиса", "Васильевна");

    public void addNewTeachers(List<Teacher> list) {
        list.add(teacher1);
        list.add(teacher2);
        list.add(teacher3);
        list.add(teacher4);
        list.add(teacher5);
    }
}
