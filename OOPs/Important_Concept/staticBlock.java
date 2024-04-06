package Important_Concept;


// This is demo to show show the initilazation  of static variables 

public class staticBlock {
    static int a = 4;
    static int b;
    

    // Will run only once when the frist object is created i.e the class will be loaded one time
    static{
        System.out.println("This is an example to inltilze the static variable");
        b= a*5;
    }
    public static void main(String[] args) {
        staticBlock obj =new staticBlock();
        System.out.println(staticBlock.a+ "   " + staticBlock.b);

        staticBlock.b += 3;
        System.out.println(staticBlock.a+ "   " + staticBlock.b);

        staticBlock obj2 = new staticBlock();
         System.out.println(staticBlock.a+ "   " + staticBlock.b);

    }

    
}
