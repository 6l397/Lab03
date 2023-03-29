package LAB.Tasks;

import java.util.Scanner;

public class Task7 {
    public void Task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть кількість чисел n: ");
        int n = scanner.nextInt();
        int sum = 0;

        if (n < 1) {
            System.out.println("Помилка");
            return;
        }

        for (int i = 1, j = 1; i <= n; i++, j++) {
            sum += 1 + i + j;
        }

        System.out.println("Сума чисел: " + sum);
    }
}
