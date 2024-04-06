
import java.util.*;

public class trnaspose {
    public static void main(String[] args) {
        int a;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the base of the transpose :  ");
        a = s.nextInt();
        int b= s.nextInt();

        int[][] n = new int[a][b];
        
        System.out.println("Enter the elemrnts into the matrix: ");


        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                n[i][j]=s.nextInt();

            }
        }
        System.out.println("Matrix before transpose: ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.println(n[i][j]+" ");
            }
        }
        System.out.println("Matrix after transpose: ");
        for(int i = 0; i < a; i++){
            for(int j = 0; j < b; j++){
                System.out.println(n[j][i]+" ");
            }
        }

    }

}
