package Recurison;

import java.util.*;

public class pattern {
    public static void main(String[] args) {
        ptr2(4, 0);

    }

    static void ptr(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            System.out.print("*");
            ptr(r, c + 1);
        } else {
            System.out.println();
            ptr(r - 1, 0);
        }
    }

    static void ptr2(int r, int c) {
        if (r == 0) {
            return;
        }
        if (r > c) {
            ptr2(r, c + 1);
            System.out.print("*");
        } else {
            ptr2(r - 1, 0);
            System.out.println();
        }
    }

}
