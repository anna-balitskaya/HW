public class Task10 {
    public static void main(String[] args) {
        int a = 0;
        int b = 5;
        int n = a + (int) (Math.random() * b+1);
        System.out.println("Случайное число: " + n);
        int tempValue = 1;
        if (n == 0) {
            tempValue = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                tempValue = tempValue * i;
            }
        }
        System.out.println(tempValue);
    }
}
