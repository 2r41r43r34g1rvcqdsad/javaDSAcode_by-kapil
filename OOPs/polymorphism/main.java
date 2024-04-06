package hellojava.OOPs.polymorphism;

// PolyMorphism -> poly - many: Morphism - Ways to represent
// it is the ways to represent one thing in multipule ways

public class main {
    public static void main(String[] args) {
        shape sp = new shape();
        circle c = new circle();
        square sq = new square();
        sp.area();
        c.area();
        sq.area();

    }

} 
