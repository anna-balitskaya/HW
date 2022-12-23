import java.util.Scanner;

public class Task7 {
    public static void main(String[] args){
        int num;
        System.out.println("Введите целое число");
        Scanner enter = new Scanner(System.in);
        num = enter.nextInt();
        if (num>=0 && num <=10)
            System.out.println("Положительное число меньше 10 или ноль");
        else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
