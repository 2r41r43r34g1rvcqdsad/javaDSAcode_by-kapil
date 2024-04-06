package Recurison;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Int_Subset {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2 };
        List<List<Integer>> ans = subDuplicate(arr);
        for (List<Integer> list : ans) {
            System.out.print(", " + list);
        }

    }

    static List<List<Integer>> sub(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for (int num : arr) {
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> Internal = new ArrayList<>(outer.get(i));
                Internal.add(num);
                outer.add(Internal);
            }

        }

        return outer;
    }

    // If the array contains the duplicate elements {1,2,2}

    static List<List<Integer>> subDuplicate(int[] arr) {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;
        for (int i = 0; i < arr.length; i++) {
            start = 0;
            // if the previous element is same as current s=e+1
            if (i > 0 && arr[i] == arr[i - 1]) {
                start = end + 1;

            }
            end = outer.size() - 1;

            int n = outer.size();
            for (int j = start; j < n; j++) {
                List<Integer> Internal = new ArrayList<>(outer.get(j));
                Internal.add(i);
                outer.add(Internal);
            }

        }

        return outer;
    }

}
