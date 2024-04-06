package hellojava.OOPs.inharitence;

public class frist {
    double l;
    double h;
    double w;
   // double hig; // it can be accessed in the child class using super()

    // contructor
    frist() {
        this.h = -1;
        this.l = -1        this.w = -1;
    }

    // cube
    frist(double side) {

        // super(); Object class

        this.w = side;
        this.l = side;
        this.h = side;
    }

    frist(double w, double l, double h) {
        this.w = w;
        this.l = l;
        this.h = h;
    }
 
    frist(frist old) {
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");
    }

}
