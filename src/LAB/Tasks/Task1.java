package LAB.Tasks;

public class Task1 {
    public String task1(int a) {
        String number = "";
        int i = a;
        double result = 0;
        if (a <= 15) {
            System.out.println("Щось пішло не так, число не може бути меншим за 15");
        } else {
            for (i = a; i >= 10; i--) {
                if (i % 2 != 0) {
                    result = Math.pow(i, 2);
                    number += i + "^2 = " + result + "\n";
                }
            }
        }
        return number;
    }
}
