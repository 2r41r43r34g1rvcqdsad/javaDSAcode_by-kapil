import java.util.*;
public class matrixRepresentationOfLinearEquation {
    public static void main(String[] args) {
        char var[]={'x', 'y', 'z','a','b','c'};
        Scanner s = new Scanner(System.in);
        int n;
        System.out.println("Enter the no oflinear equations u wnat to enter: ");
        n=s.nextInt();
        int a[][]=new int[n][n];
        int crr[][]=new int[n][1];

        System.out.println("Enter the equations ");
        for(int i=0; i<n;   i++){
            for(int j=0;j<n;j++){
                a[i][j] = s.nextInt();
            }
            crr[i][0]=s.nextInt(); 
        }


        System.out.println("Matrix representation is : ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(" "+a[i][j]);
            }
            System.out.print(" "+ var[i]);
            System.out.print(" = "+crr[i][0]);
            System.out.println();

        }
        s.close();

    }

    
}
