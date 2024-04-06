// abstract class Shape {
//     abstract  void area();

//     }

// class rectangle extends Shape {
//     void area(){
//         int a=2;
//         int b=4;
//         int area = a*b;
//         System.out.println("area :"+area);

//     }
// }
// class circle extends Shape {
//     void area(){
//         int a=2;
//         int b=4;
//         double c=a*b;
//         double d=3.14;

//         double area=c*d;
//         System.out.println("area :"+area);
//     }
// }
// public class testAbstraction{
//     public static void main(String[] args) {
//         Shape s= new circle();
//         s.area();
//     }

// }


// abstract class villege{
    
//     abstract  void abstractin(); //abstract method has no body.

//     void non_abstract(){System.out.println("Villiage is beautiful: ");} // non abstract method has body;
    
// }
// class shayam extends villege{
//     void abstractin(){
//         System.out.println("I am mukhiya");
//     }
// }
// public class testAbstraction{
//     public static void main(String[] args) {
//         villege v = new shayam();
        
//         v.abstractin();
//         v.non_abstract();
//     }
// }


