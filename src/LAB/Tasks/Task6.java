package LAB.Tasks;

import java.util.Scanner;

public class Task6 {
    public void Task6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть число a");
        int a = scanner.nextInt(); // початок діапазону
        System.out.println("Вкажіть число b");
        int b = scanner.nextInt(); // кінець діапазону
        int count1 = 0; // лічильник чисел, що задовольняють першу умову
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 != 0) { // перевірка умови кратності 3 і не кратності 5
                count1++; // якщо умова виконується, збільшуємо лічильник на 1
            }
        }
        System.out.println("Кількість чисел, які кратні 3 і не кратні 5: " + count1);
        int count2 = 0; // лічильник чисел, що задовольняють другу умову

        for (int i = a; i <= b; i++) {
            if (i % 2 == 0 && Math.sqrt(i) % 1 == 0) { // перевірка умови парності та квадратності
                count2++; // якщо умова виконується, збільшуємо лічильник на 1
            }
        }

        System.out.println("Кількість чисел, які є квадратами парних чисел: " + count2);
    }
}
