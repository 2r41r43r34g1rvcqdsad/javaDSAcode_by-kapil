class m {
    void run() {
        System.out.println("The program is running ");
    };

}

class p extends m {
    void run() {
        System.out.println(" program is running ");
    };
}

public class method_overriding {
    public static void main(String[] args) {
        new p().run();
        new m().run();
    }
}
