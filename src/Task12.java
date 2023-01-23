public class Task12 {
    public static void main(String[] args) {
//        Первый вариант: когда создается массив с пустыми ячейками, а только потом помещаем чиса
        int[] num = new int[21];
        for(int i =10; i<num.length; i++){
            num[i] = i;
        }
        for(int i = 10; i<num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println();
        System.out.println();
        for(int i = 10; i<num.length; i++) {
            System.out.println(num[i] + " ");
        }
        System.out.println();
//        Второй вариант: когда знаем какие числа хотим поместить
        int[] num1 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < num1.length; i++) {
            System.out.print(num1[i] + " ");
        }
        System.out.println();
        System.out.println();
        int[] num2 = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }
    }
}