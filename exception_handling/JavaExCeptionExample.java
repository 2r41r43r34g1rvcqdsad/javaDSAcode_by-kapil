public class JavaExCeptionExample {
    public static void main(String[] args) {
        
        try{
            int data = 100/0;

        }
        catch(ArithmeticException e){
            System.out.println("Rest of code: ");
    }
    
}
}



// int a = 100/0; //ArithmeticException
//String s = null; 
//sout(s.length()); //NullPointerException
// Sritng s="abc";
// int i= Integer.presentInt(s); //NumberFormetException

// int a[]=new int[5];
// a[10]=50; ArrayOutOfBoundriesException