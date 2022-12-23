public class Task9 {
    public static void main(String[] args){
        int num=1;
        do{
            if(num%5==0){
                System.out.println("Числа от 1 до 100, которые делятся на 5 без остатка: " + num );
            }
            num++;
        } while(num<100);

    }
}
