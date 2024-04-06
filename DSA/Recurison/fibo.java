package Recurison;

class fibo{
    public static void main(String[] args) {
        // int n=50;
        // for(int i=0;i<11;i++){
        //     System.out.println(ForMual(i));
        // }
        System.out.println(fibo(10));
        

        
    
    
    }
     static long ForMual(int n){
        return (long  )(Math.pow(((1+Math.sqrt(5))/2),n)/Math.sqrt(5));
     }
    



    static int fibo(int n){
        if(n<2){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

}