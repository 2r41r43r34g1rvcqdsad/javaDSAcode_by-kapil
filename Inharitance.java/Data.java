import javax.sound.sampled.SourceDataLine;

// public class Data{
//     int salary = 100;

// }
// class tata extends Data{
//     int bonus =8599404;
//     public static void main(String[] args){
//         Data n = new Data();
//         System.out.println(n.salary);
//         System.out.println(n.bonus);

//     }
// }

// single inharitence in java 

// class En {
//     void p() {
//         System.out.println("elephnt");
//     }

// }

// class t extends En {
//     void lo() {
//         System.out.println("jfjfk");
//     }

// }

// public class Data {
//     public static void main(String[] args) {
//         t o = new t();
//         o.p();
//         o.lo();

//     }
// }


// multilevel inharitence


class tress{
    
    void u(){
        int[] arr = {1,32,42,32};

        System.out.println(arr);
    }
}
class branch extends tress{
    void name(){
        String[] Branchnaem={"tahni","tahna"};
        System.out.println(Branchnaem);

    }
}
class leaf extends branch{
    void Leafname(){
        String Lname="leaf";
        System.out.println(Lname);
    }
}

public class Data{
    public static void main(String[] args){
        leaf h=new leaf();
        h.u();
        h.name();
        h.Leafname();
    }

}
