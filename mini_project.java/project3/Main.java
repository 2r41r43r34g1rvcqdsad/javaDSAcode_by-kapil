package project3;

import project3.Functions;  // Correctly capitalized import

public class Main {  // Class name should also be capitalized
    public static void main(String[] args) {
        int n = 3;
        int m = 2;

        Functions func = new Functions();  // Capitalized class name
        func.calculations(n, m);

        System.out.println("Addition: " + func.getAdd());
        System.out.println("Subtraction: " + func.getSub());
        System.out.println("Multiplication: " + func.getMulti());
        System.out.println("Division: " + func.getDiv());
    }
}
