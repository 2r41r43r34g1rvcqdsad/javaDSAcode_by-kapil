import java.util.*;

public class delNumofArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, loc=0, flag = 1;
        System.out.println("Enter the lenght of the array: ");
        n = s.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        System.out.println("Enter the element ot delete: ");
        int element = s.nextInt();
        for (int i = 0; i < n; i++) {
            if (arr[i] == element) {
                flag = 1;
                loc = i;
                break;
            } else {
                flag = 0;
            }
        }
        if (flag == 1) {
            for (int i = loc + 1; i < n; i++) {
                arr[i - 1] = arr[i];
            }

            System.out.println("After deletiion ");
            for (int i = 0; i < n - 2; i++) {
                System.out.println(arr[i]);

            }
            System.out.println(arr[n-2]);

        }
        else{
            System.out.println("Element not fonund: ");
        }

    }

}
