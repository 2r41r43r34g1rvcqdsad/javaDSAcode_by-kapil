package Important_Concept;
public class Imp_consecpt {
    
  
    /*
     what is a class?
     ans-> A clasis collection of different types of properties and function, It is like a tamplet using which we can make no of object.

     * Why do we need class?
     * ans- We need the classes because we want to acccess the diffenet types of poroperties and functions with the help of one objevet.
     * 
     * What is a object?
     * Ans- It is instance of a class.
     * 
     * For the objects the intial value in java is null
     * 
     * New-> Dynamicaly allocates the memory and returns athe refrence to it
     * 
     * objects are stored in the heap mamory, and the reference variavles are sotred in thr stack memory, they are pointing to yhe heap memory
     * constructor is a special type of function that runs when you create an object, and it allcates ssome variables.

     */

    // create calss 
    // just declarre
   public static void main(String[] args) {
    student s = new student();
    student t = new student(0, null, 0);
    // s.name = "kapil";
    // s.rno = 23;
    // s.marks = 23;
    System.out.println(t.rno); 
    System.out.println(t.name);
    System.out.println(t.marks);
   }
}
class student{
    int rno;
    String name;
    float marks;

    // we need a way to add teh values of the above 
    // properties object by object

    // we need one word to access every object

     
    student(){   // constructor 
    this.name = "kapil";
    this.rno = 23;
    this.marks = 23;


    


    }
    student(int no, String naam , float ank){
        this.rno= no;
        this.name= naam;
        this.marks= ank;
    }

    }

