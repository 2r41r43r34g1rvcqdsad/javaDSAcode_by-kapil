package hellojava.OOPs.inharitence;

// here we are creating the child class of the class frist
// It will inharitate the properties of the frist.java using the extends words 
public class FristWeight extends frist  {
    double weight;
    FristWeight(){
        this.weight=-1;
    }
    FristWeight (double l, double h, double w, double weight){
        super(l, h, w); // what is this? Calls the parent class constructor
        // used to intilaize the valus at the parents class constuctor
        this.weight = weight;

        //System.out.println(super.hig); // accessing super using super();



    }


     
}
