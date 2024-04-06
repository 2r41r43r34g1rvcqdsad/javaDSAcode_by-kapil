package hellojava.OOPs.inharitence;

public class frist_main {
    public static void main(String[] args) {
        // frist box = new frist(1,2,3);

        // // It wil print the box which is not taking the argument 
        // System.out.println(box.l + " " + box.w + " " + box.h);
        // FristWeight box2 = new FristWeight();
        // FristWeight box3 = new FristWeight(1,2,3,4); // If you want to access the propertie of the frist then use super()

        // System.out.println(box2.h+ " "+ box2.w+ " "+ box2.h + " "+ box2.weight);    
        

        frist box5 = new FristWeight(1, 0, 0, 0);
        // Here thing to note is u will not be able to access the propertie of child class(Fristweigth)
        // it is refrencing to the parent class frists so u can easly access the l,w,h but not weight
        // if u will do viseversa u will not be able  to access the weight but not l,w,h
          //System.out.println(box5.weight);
        //System.out.println(box5);

    }
    
}
