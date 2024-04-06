import java.util.Scanner;

import javax.swing.DefaultRowSorter;

import java.io.BufferedReader;
import java.io.InputStreamReader;


public class matrix_multiplication {
    public static void main(String[] args){
    //     int n ;
    //     System.out.println("Enter the size of the matrix : " );
    //     Scanner sc = new Scanner(System.in);
    //     n=sc.nextInt();
    //     int [] []a =new int[n][n];
    //     int[][] b =new int[n][n];
    //     int [][]c =new int[n][n];

    //     System.out.println("Enter the elemwnts into matrix : ");
    //     for (int i= 0;i<n;i++){
    //         for(int j =0 ;j<n;j++){
    //             a[i][j]=sc.nextInt();
    //                     }
    //     }
    //     System.out.println("Ente the elements into matrx b :");
    //     for (int i = 0 ;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             b[i][j]=sc.nextInt();
            
    //         }

    //     }
    //     System.out.println("Multipling matrix..............");
    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             for(int k=0;k<n;k++){
    //                 c[i][j]+=a[i][k]*b[k][j];
    //         }
    //     }
    // }

    // System.out.println("The product of the matrix is : ");


    //     for(int i=0;i<n;i++){
    //         for(int j=0;j<n;j++){
    //             System.out.print(c[i][j]+ " ");
                
    //         }
    //         System.out.println();
    //     }
    //     sc.close();


    // System.out.println("Enter the dimensions of the A matrix : ");
    // Scanner sc = new Scanner(System.in);
    // int rowA=sc.nextInt();
    // int calA= sc.nextInt();

    // System.out.println("Enter the dimenstion of the B matrix : ");
    // int rowB=sc.nextInt();
    // int colB=sc.nextInt();

    // if(rowA == colB){
    //     System.out.println("The dimentions are realible to multiply :");

    // }
    // else {
    //     System.out.println("The dimentions are not realible");
    // }




    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int order = 0;
    int [][] matrix = new int [3][3];
    System.out.println("Enter the elements into the matrix : ");
    int i,j;
    for(i=0;i<matrix.length;i++){
        for(j=0;j<matrix[i].length;j++){
            try{
                matrix[i][j]=Integer.parseInt(br.readLine());



            }
            catch(Exception e){
                System.out.println("an error occured");
                return;

            }
    }



    }

    int determinant,x,y,z;
    x=(matrix[0][0]*(matrix[1][1]*matrix[2][2]-matrix[1][2]*matrix[2][1]));
    y=(matrix[0][1]*(matrix[1][0]*matrix[2][2]-matrix[1][2]*matrix[2][0]));
    z=(matrix[0][2]*(matrix[1][0]*matrix[2][1]-matrix[1][1]*matrix[2][0]));

    determinant=x-y+z;
    System.out.println("The modulus of the given matrix is :" + determinant);



    
}
}

