import java.util.*;

public class multiOfTwoMatrix {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the base of the java: ");
        n = s.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];
        System.out.println("Enter the elements into first array: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = s.nextInt();

            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = s.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                for(int k=0; k<n; k++){
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Multipliying the array: ");

        System.out.println("The product of the array is: ");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(c[i][j]+ " ");
                    
            }
            System.out.println();

        }
        s.close();

    }

}
