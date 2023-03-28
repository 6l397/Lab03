package LAB.Tasks;

import java.util.Scanner;

public class Task4 {
    public void Task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уведіть x");
        int x = scanner.nextInt();
        System.out.println("Уведіть y");
        int y = scanner.nextInt();
        int res = 0;
        for (int i = 0; i < y; i++) {
            res += x;
        }
        System.out.println("Відповідь: " + res);
    }
}
