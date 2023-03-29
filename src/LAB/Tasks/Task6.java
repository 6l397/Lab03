package LAB.Tasks;

import java.util.Scanner;

public class Task6 {
    public void Task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вкажіть число a");
        int a = scanner.nextInt();
        System.out.println("Вкажіть число b");
        int b = scanner.nextInt();
        int count1 = 0;
        int count2 = 0;
        for (int i = a; i <= b; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                count1++;
            }
            if (i % 2 == 0 && Math.sqrt(i) % 1 == 0) {
                count2++;
            }
        }
        System.out.println("Кількість чисел, які кратні 3 і не кратні 5: " + count1);
        System.out.println("Кількість чисел, які є квадратами парних чисел: " + count2);
    }
}
