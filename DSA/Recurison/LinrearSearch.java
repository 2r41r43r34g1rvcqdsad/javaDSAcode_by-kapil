package Recurison;

import java.util.ArrayList;

public class LinrearSearch {
    public static void main(String[] args) {
        int arr[]= {1,2,3,4,5,5,6,7};

        System.out.println(Index(arr,5,0));
        
    }
    static boolean search(int[]arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || search(arr,target,index+1);
    }
    static int Index(int[] arr, int target, int index){
        if(index==arr.length){
            return -1;

        }
        if(arr[index]==target){
            return index;
        }
        else{
            return Index(arr,target,index+1);
        }
    }
    static int IndexLast(int[] arr, int target, int index){
        if(index==-1){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        else{
            return IndexLast(arr, target , index-1);
        }
    }
    static ArrayList<Integer> list= new ArrayList<>();
    static void FindAllIndex(int[] arr, int target, int index ){   // FInding all the all the indexes into the arrya. 
        if(index==arr.length){
            return ;
        }
        if(arr[index]==target){
            list.add(index);
        }
         FindAllIndex(arr, target, index+1);
    }
     static ArrayList<Integer> FindAllIndex2(int[] arr, int target, int index ){   // FInding all the all the indexes into the arrya. 
         ArrayList<Integer> nlist= new ArrayList<>();
        if(index==arr.length){
            return  nlist;
        }
        if(arr[index]==target){
            nlist.add(index);
        }
         ArrayList<Integer> TakeBelowAns= FindAllIndex2(arr, target, index+1);
         nlist.addAll(TakeBelowAns);
         return nlist;
    }


}
