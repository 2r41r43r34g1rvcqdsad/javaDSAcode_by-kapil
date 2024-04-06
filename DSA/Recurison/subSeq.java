package Recurison;

import java.util.ArrayList;

public class subSeq {
    public static void main(String[] args) {
        subets("", "abc");
        // System.out.println(sub("","abc"));
        // subetsAsqui("","abc");
        
    }
    static void subets(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subets(p, up.substring(1));
        subets(p+ch, up.substring(1));
        //System.out.println(subt(p+ch, up.substring(1)));
    }

    // subsets for the array list
    static ArrayList<String> sub(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = sub(p, up.substring(1));
        ArrayList<String> right = sub(p+ch, up.substring(1));
        left.addAll(right);
        return left;


    }
    //ascci a=97 like that 
     static void subetsAsqui(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        subetsAsqui(p, up.substring(1));
        subetsAsqui(p+ch, up.substring(1));
        subetsAsqui(p+(ch+0), up.substring(1));
    }
     static ArrayList<String> subt(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch = up.charAt(0);
        ArrayList<String> left = subt(p, up.substring(1));
        ArrayList<String> right = subt(p+ch, up.substring(1));
        ArrayList<String> mid = subt( p+(ch+0), up.substring(1));
        left.addAll(right);
        left.addAll(mid);
        return left;


    }

  
}

