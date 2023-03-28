package LAB.Tasks;

import java.util.Scanner;

public class Task1 {
    public void Task1() {
        System.out.println("Уведіть число більше за 15");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a <= 15) {
            System.out.println("Щось пішло не так, число не може бути меншим за 15");
        }
        for (int i = 10; i <= a; i++) {
            if (i % 2 != 0) {
                System.out.println( i + "^2 = " + Math.pow(i, 2));
            }
        }
    }
}
