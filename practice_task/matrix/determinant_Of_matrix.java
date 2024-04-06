import java.io.BufferedReader;
import java.io.InputStreamReader;

public class determinant_Of_matrix {
    public static void main(String[] args) {
        BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter the dimension of the matrix: ");
        int n = s.nextInt();
        int a[][] = new int[n][n];
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < n; j++) {
                try {
                    a[j][j] = Integer.parseInt(s.readLine());
                } catch (Exception e) {
                    System.out.println("An error occured: ");
                    return;
                }
            }
        }
        int x, y, z, detr;

        System.out.println("Calculating the diterminant : ");

        x = (a[0][0] = (a[1][1] * a[2][2] - a[1][2] * a[2][1]));
        y = (a[0][1] = (a[1][0] * a[2][2] - a[1][2] * a[2][0]));
        z = (a[0][2] = (a[1][0] * a[2][1] - a[1][1] * a[2][0]));
        detr = x - (y + z);

        System.out.println("The dietermint is :"+detr);


    }

}
