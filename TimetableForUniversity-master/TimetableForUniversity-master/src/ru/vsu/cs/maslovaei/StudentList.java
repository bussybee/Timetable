package ru.vsu.cs.maslovaei;

import java.util.ArrayList;
import java.util.List;

public class StudentList {


    private List<Student> studentList = new ArrayList<>();

    Student student1 = new Student("Авдеева", "Полина", "Андреевна", 19, 1, "ФКН", 1, "Очная");
    Student student2 = new Student("Батурин", "Влас", "Андреевич", 18, 1, "ФКН", 1, "Очная");
    Student student3 = new Student("Березин", "Ярослав", "Алексеевич", 20, 1, "ФКН", 1, "Очная");
    Student student4 = new Student("Волобуева", "Алина", "Александровна", 21, 1, "ФКН", 1, "Очная");
    Student student5 = new Student("Долженко", "Максим", "Сергеевич", 21, 1, "ФКН", 1, "Очная");
    Student student6 = new Student("Зотов", "Максим", "Александрович", 20, 2, "ФКН", 2, "Очно-заочная");
    Student student7 = new Student("Капустин", "Максим", "Иванович", 19, 2, "ФКН", 2, "Очно-заочная");
    Student student8 = new Student("Карпухин", "Егор", "Дмитриевич", 20, 2, "ФКН", 2, "Очно-заочная");
    Student student9 = new Student("Кислова", "Ирина", "Валерьевна", 21, 2, "ФКН", 2, "Очно-заочная");
    Student student10 = new Student("Кунахова", "Алина", "Юрьевна", 18, 2, "Биофак", 2, "Очная");
    Student student11 = new Student("Захаров", "Вячеслав", "Владимирович", 18, 3, "Биофак", 1, "Очная");
    Student student12 = new Student("Улетаев", "Себастьян", "Акакиевич", 19, 3, "Биофак", 1, "Очная");
    Student student13 = new Student("Парамонова", "Светлана", "Валерьяновна", 19, 3, "Биофак", 1, "Очная");
    Student student14 = new Student("Маслов", "Пётр", "Юрьевич", 17, 3, "Биофак", 1, "Очная");
    Student student15 = new Student("Мелконян", "Самвел", "Зелимханович", 19, 3, "Биофак", 1, "Очная");
    Student student16 = new Student("Акопян", "Амаяк", "Арутюнович", 19, 4, "Биофак", 2, "Очно-заочная");
    Student student17 = new Student("Прилетайло", "Вбубен", "Бутылкович", 19, 4, "Биофак", 2, "Очно-заочная");
    Student student18 = new Student("Мамкина", "Гордость", "Феодосьевна", 24, 4, "Биофак", 2, "Очно-заочная");
    Student student19 = new Student("Ложкин", "Василий", "Михайлович", 21, 4, "Биофак", 2, "Очно-заочная");
    Student student20 = new Student("Последнев", "Вениамин", "Валентинович", 20, 4, "Биофак", 2, "Очно-заочная");



    public void addNewStudents(List<Student> list) {
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        list.add(student11);
        list.add(student12);
        list.add(student13);
        list.add(student14);
        list.add(student15);
        list.add(student16);
        list.add(student17);
        list.add(student18);
        list.add(student19);
        list.add(student20);
    }

    public void facultyPrint(String faculty) {
        System.out.println("Список студентов факультета " + faculty);
        for (Student st : studentList) {
            if (st.getFaculty().equals(faculty)) {
                System.out.println(st);
            }
        }
    }

    public void coursePrint(int course) {
        System.out.println("Список студентов факультета " + " курса " + course);
        for (Student st : studentList) {
            if (st.getCourse() == course) {
                System.out.println(st);
            }
        }
    }

    public void groupPrint(int group) {
        System.out.println("Список студентов группы " + group);
        for (Student st : studentList) {
            if (group == st.getGroupId()) {
                System.out.println(st);
            }
        }
    }
}
