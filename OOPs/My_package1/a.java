package hellojava.OOPs.My_package1;
import hellojava.OOPs.My_package2.b;

public class a {
    // public static void main(String[] args) {
    //     System.out.println("Hello");
    //     b.sayH();


    // }
    public int age;
    String name;
    int salary;
    Boolean married;
    public static long population;

    public a(int age, String name, int salary, Boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        a.population +=1;
    }
}
