package LAB.Main;

import LAB.Tasks.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Оберіть номер завдання, яке ви хочете розв'язати");
            String Exercise = scanner.nextLine();
            switch (Exercise) {
                case "1":
                    System.out.println("Уведіть число більше за 15");
                    Scanner scan = new Scanner(System.in);
                    int a = scan.nextInt();
                    Task1 first = new Task1();
                    first.task1(a);
                    System.out.println(first.task1(a));
                    break;
                case "2":
                    Task2 task2 = new Task2();
                    task2.Task2();
                    break;
                case "3":
                    Task3 task3 = new Task3();
                    task3.Task3();
                    break;
                case "4":
                    Task4 task4 = new Task4();
                    task4.Task4();
                    break;
                case "5":
                    Task5 task5 = new Task5();
                    task5.Task5();
                    break;
                case "6":
                    Task6 task6 = new Task6();
                    task6.Task6();
                    break;
                case "7":
                    Task7 task7 = new Task7();
                    task7.Task7();
                default:
                    break;
            }
        }
    }
}