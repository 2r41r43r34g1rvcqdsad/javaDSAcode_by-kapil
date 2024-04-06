//
//super is used to refer immediate parent class instance variable.

// class SUPE {
//     String  color = "white";

// }
// class b extends SUPE{
//     void l(){
//         String color= "black";
//         System.out.println(color);
//         System.out.println(super.color);

//     }

// }

// public class SUPER{
//     public static void main(String[] args) {
//         b n=new b();
//         n.l();;

//     }
// }

//super can be used to invoke parent class method
// class m{
//     void dinner(){
//         System.out.println("Dinner is teken");
//     }

// }

// class n extends m{
//     void dinner(){
//         System.out.println("He is not eating dinner");
//     }
//     void lunch(){
//         System.out.println("He is taking lunch");

//     }

//     void b(){
//         super.dinner();
//         lunch();

//     }
// }
// public class SUPER{
//     public static void main(String[] args){
//         n o = new n();
//         o.b();
//     }
// }

//super is used to invoke parent class constructor.
// class u{
//     u(){
//         System.out.println("I am the manager:");

//     }
// }
// class y extends u{

//     y(){
//         super();
//         System.out.println("ijhs");

//     }
// }
// public class SUPER{
//     public static void main(String[] args) {
//         y n = new y();

//     }
// }


