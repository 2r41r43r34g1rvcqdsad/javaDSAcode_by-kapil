package Important_Concept;

public class innerClasses {
    static class fun {
        String name;   
        public fun(String name){
            this.name = name;
        }  
        
    }   // Only inner classes con be static, bcz it depend on the outer classes
    public static void main(String[] args) {/* Here we are observing that for the static method we are able to make the 
                                               objcet, but we know that static is indpendent of obj, here it not following the rule
                                               the reason is the class is fun is dependent of upperclass-innerclass, so it will not depend on 
                                               the objects of the upperclass but, fun can have its own objects. Thatswhy it is static fun can 
                                               have the objects.  */
        fun obj1 = new fun("Kapil");
        fun obj2 = new fun("Rahul");
        System.out.println(obj1.name);
        System.out.println(obj2.name);
    } 
    
}
// But outer classes should be static bcz it does not depends dependes on the outer class, it itself a outer class
//static class test{} 
