package LAB.Tasks;

import java.util.Scanner;

public class Task5 {
    public void Task5() {
        System.out.println("Уведіть число n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int pow = 0;
        if (n <= 0) {
            System.out.println("Щось пішло не так :(");
            return;
        }

        for (int i = 1; i <= 2 * n - 1; i += 2) {
            pow += i;
        }

        System.out.println(n + "^2  = " + pow);
    }
}
