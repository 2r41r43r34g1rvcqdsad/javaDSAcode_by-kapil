package Recurison;

import java.util.ArrayList;

public class dice {
    public static void main(String[] args) {
        face("", 4);
        //System.out.println(facea("", 4));


    }

    static void face(String p, int target) {
        if (target == 0) {
            System.out.println(p);
            return;
        }
        for (int i = 1; i <= 6 && i <= target; i++) {
            face(p + i, target - i);

        }
    }
    static ArrayList<String> facea(String p, int target) {
        if (target == 0) {
           ArrayList<String> list= new ArrayList<>();
           list.add(p);
           return list;
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 1; i <= 6 && i <= target; i++) {
           list.addAll( facea(p + i, target - i));

        }
        return list;
    }
    static void f(int p, int t){
        if(t==0){
            System.out.println(p);

        }
        for(int i =1; i<6 && i<=t; i++){
            f(p+i,t-1);
        }
    }

}
