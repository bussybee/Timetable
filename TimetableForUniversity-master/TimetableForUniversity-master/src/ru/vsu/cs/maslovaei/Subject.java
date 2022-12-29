package ru.vsu.cs.maslovaei;

public class Subject {

    private int id;
    private static int nextId = 1;
    private String name;
    Teacher teacher;


    public Subject(String name, Teacher teacher) {
        this.id = nextId++;
        this.name = name;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "\nId - " + id + " - " + name + ". Преподаватель: " + teacher.getName() + " " + teacher.getSurname() + " " + teacher.getPatronymic();
    }
}
