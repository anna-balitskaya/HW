public class Task14 {
    public static void main(String[] args){
        int [][] m = new int[8][5];
        for(int i =0; i<m.length; i++){
            for(int n =0; n<m[i].length; n++){
                m[i][n]=(int)(Math.random() * 90)+10;
                System.out.print(m[i][n]+" ");
            }
            System.out.println(" ");
        }
    }
}
