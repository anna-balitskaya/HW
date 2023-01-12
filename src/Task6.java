import java.util.Scanner;

public class Task6 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите значения трех вещественных чисел:");
        String number1 = scan.nextLine();
        double d1 = Double.parseDouble(number1);
        String number2 = scan.nextLine();
        double d2 = Double.parseDouble(number2);
        String number3 = scan.nextLine();
        Double d3 = Double.parseDouble(number3);
        System.out.println("Cреднее значение трех вещественных чисел равно: "+((d1+d2+d3)/3));
    }
}
