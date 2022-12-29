package ru.vsu.cs.maslovaei;

import java.util.Scanner;

import static ru.vsu.cs.maslovaei.Main.*;

public class Menu {

    Scanner scanner = new Scanner(System.in);
    int answer = 0;

    public void printMenu() {
        while (true) {

            System.out.println(
                    "1) Посмотреть список учащихся\n" +
                            "2) Посмотреть список предметов\n" +
                            "3) Посмотреть список преподавателей\n" +
                            "4) Посмотреть расписание\n" +
                            "0) Выход"
            );
            answer = scanner.nextInt();

            if (answer == 1) {
                System.out.println(
                        "1 - Все учащиеся\n" +
                                "2 - Учащиеся определенного курса\n" +
                                "3 - Учащиеся определённой группы\n"
                );
                answer = scanner.nextInt();

                if (answer == 1) {
                    System.out.println(students);
                } else if (answer == 2) {
                    System.out.println("Введите нужный курс");
                    answer = scanner.nextInt();
                    studentsByCourse(answer);
                } else if (answer == 3) {
                    System.out.println("Введите нужную группу");
                    answer = scanner.nextInt();
                    studentsByGroup(answer);
                }

            } else if (answer == 2) {
                System.out.println(subjects);

            } else if (answer == 3) {
                System.out.println(teachers);

            } else if (answer == 0) {
                break;
            }
        }
    }

    public void start() {

        System.out.println(
                "Добро пожаловать на портал нашего учебного заведения!\n\n" +
                        "Выберите интересующее вас меню: ");
        printMenu();
    }

    public void studentsByCourse(int course) {
        for (var student : students) {
            if (student.getCourse() == course) {
                System.out.println(student);
            }
        }
    }

    public void studentsByGroup(int group) {
        for (var student : students) {
            if (student.getGroupId() == group) {
                System.out.println(student);
            }
        }
    }
}