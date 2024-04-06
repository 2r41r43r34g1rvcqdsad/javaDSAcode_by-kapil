interface country{
    void city();

}
class capital implements country{
    public void city(){
    System.out.println("Delhi ");}

}
class state implements country{
    public void city(){

        System.out.println("Bhopal");
    }
}
public class  Implementation{
    public static void main(String[] args) {
        
        country c =new capital();
        c.city();
    }
}