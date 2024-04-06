import javax.xml.transform.Source;

public class java_try_catch_bloc {
    public static void main(String[] args) {

        // Examplee 1
        // int data = 100/0;
        // System.out.println("Print rest of the the code: "); will throw  an AretmenticErrorExcption

        // Example 2
        
        // try{
        //     int data= 100/0; // may  throw an error
        // }
        // // handeling the error
        // catch (ArithmeticException e) {
        //     System.out.println(e);                               // it is the right way to handle the excption 

        // }
        // System.out.println("Rest of the code: ");


        //Example 3
         
        // try{
        //     int data = 100/0;
        //     System.out.println("Print the rest of code: ");    // this will also throw an error

        // }
        
        // catch(ArithmeticException e){
        //     System.out.println(e);
        // }

        //Example 4

        // handling the exception by using Exception class   

        // try{
        //     int data = 100/0;

        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        // System.out.println("Print the rest of code: "); 



        // Exampale 5
        // int d= 100;
        //     int p=0;

        // try{
        //     int t= d/p;
            
            
        // }
        // catch(Exception e){
        //     System.out.println(d/(p+2));
        // }



        //example 6
        //ArrayIndexOutOfBoundsException

        // try{
        //     int d[]= {1,2,3,4,5};
        //     System.out.println(d[10]);

        // }
        // catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e);
        // }
        // System.out.println("Rest of the code :");








        
    }
    
}
