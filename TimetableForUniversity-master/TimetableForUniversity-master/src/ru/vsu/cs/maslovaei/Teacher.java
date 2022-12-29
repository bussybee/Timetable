package ru.vsu.cs.maslovaei;

public class Teacher {

    private int id;
    static private int nextId = 1;
    private String name;
    private String surname;
    private String patronymic;

    public Teacher(String surname, String name, String patronymic) {
        id = nextId++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;

    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }


    public String toString() {
        return "\nId - " + id + " - " + surname + " " + name + " " + patronymic;
    }
}
