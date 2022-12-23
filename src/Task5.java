import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        float num;
        System.out.println("Введите целое число");
        Scanner enter = new Scanner(System.in);
        num = enter.nextFloat();
        if(num%2==0)
            System.out.println("Вы ввели четное число!");
        else if (num%2 ==1)
            System.out.println("Вы ввели нечетное число!");
        else if (num % 2 != 1 && num % 2 != 0)
            System.out.println("Вы ввели не целое число!");
    }
}
