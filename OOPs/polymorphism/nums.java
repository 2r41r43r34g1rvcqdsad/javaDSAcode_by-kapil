package hellojava.OOPs.polymorphism;

public class nums {
    int sum(int a, int b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        nums n = new nums();
        // these both are the examples of the runtime polymorphism
        n.sum(1,2);
        n.sum(1,2,3);      

    }
    
}
 