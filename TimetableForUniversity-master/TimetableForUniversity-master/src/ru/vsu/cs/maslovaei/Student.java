package ru.vsu.cs.maslovaei;

public class Student {

    private int id;
    private static int nextId = 1;
    private String name;
    private String surname;
    private String patronymic;
    private int age;
    private int groupId;
    private String faculty;
    private int course;
    private String educationForm;

    public Student(String surname, String name, String patronymic, int age,
                   int groupId, String faculty, int course, String educationForm) {
        id = nextId++;
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.groupId = groupId;
        this.faculty = faculty;
        this.course = course;
        this.educationForm = educationForm;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupId() {
        return groupId;
    }

    public void setGroupId(int groupId) {
        this.groupId = groupId;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }


    public String toString() {
        return "\nId - " + id + " - Student " + course + " course, " + faculty + " faculty, " + groupId + " group: "
                + surname + " " + name + " " + patronymic + ", " + age + " y.o.";
    }

    public String fullName() {
        return surname + " " + name + " " + patronymic;
    }
}
