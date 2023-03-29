package LAB.Tasks;

import java.util.Scanner;

public class Task3 {
    public void Task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Уведіть дані: \n");
        System.out.println("a = ");
        int a = scanner.nextInt();
        System.out.println("b = ");
        int b = scanner.nextInt();
        System.out.println("h = ");
        float h = scanner.nextFloat();
        int sum = 0;
        int count = 0;
        for (int i = a; i <= b; i += h) {
            sum += i;
            count++;
        }
        double average = sum / count;
        System.out.println("Середнє арифметичне: " + average);
    }
}
