public class Task13 {
    public static void main (String[] args){
//        Первый вариант
        int[] m = new int[20];
        for(int i =0; i<m.length; i++) {
            if (i < 2) {
                m[i] = 1;
            } else {
                m[i] = m[i - 1] + m[i - 2];
            }
            System.out.print(m[i] + " ");
        }
        System.out.println();

//        Второй вариант
        m[0] = 1;
        m[1] = 1;
        System.out.print(m[0] + " " + m[1] +" ");
        for(int i = 2; i<m.length; i++) {
            m[i] = m[i - 1] + m[i - 2];
            System.out.print(m[i]+" ");
        }
    }
}
