package LAB.Tasks;

import java.util.Scanner;

public class Task2 {
    public void Task2() {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        for (int i = 1; i < 10; i++) {
            int answer = k*i;
             {
                System.out.println (k + " * " + i + " = " + answer);
            }
        }
    }
}