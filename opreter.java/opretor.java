import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class opretor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
         * double a=2;
         * double b=5;
         * double sum = a+b;
         * double sub = a-b;
         * double div = a/b;
         * double modulo = a%b;
         * double multi = a*b;
         * System.out.println(sum);
         * System.out.println(sub);
         * System.out.println(div);
         * System.out.println(modulo);
         * System.out.println(multi);
         * || or
         * && and
         */
        System.out.println("Enter your marks");
        int mark = sc.nextInt();
        System.out.println("ENter your name: ");
        String name = sc.next();

        System.out.println(mark);
        System.out.println(name);

    }

}
