class b {
    int amount;
    String name;
    int depost;

    void insert(int a, String b, int depo) {
        amount = a;
        name = b;
        depost = depo;
    }

    // depsoit
    void dpo(int d) {
        amount = amount + d;
        System.out.println(amount);
    }

    // balance
    void bb() {
        System.out.println(amount);
    }

    // dispaly
    void display() {
        System.out.println(amount + " " + name + " " + depost);

    }
    // withdrawl

    void withdraw(int amt ){
        if(amount<amt){
            System.out.println("Not is not sufficiant ");
        }

        else {
            System.out.println("The withdrawal amount "+ amt);
        }
    }

}

public class bank {
    public static void main(String[] args) {
        b n = new b();
        n.insert(100, "kapil", 12);
        n.withdraw(54);
        n.dpo(90);
    }

}
