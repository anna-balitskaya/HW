public class Task4 {
    public static void main(String[] args){
        int a = 200;
        int b = 30;
        int discountAPercent = a*15/100;
        System.out.println("Итоговая цена за 10 А равна: " + (a-discountAPercent)*10);
        System.out.println("Итоговая цена за 10 Б равна: " + b);
        System.out.println("Итоговая цена за 10 А и 2 Б равна: " + (((a-discountAPercent)*10+b*2)));
        System.out.println();
        System.out.println("Итоговая цена за 10 А и 2 Б равна: " + ((((a-(a*15/100))*10))+b*2));
    }
}
