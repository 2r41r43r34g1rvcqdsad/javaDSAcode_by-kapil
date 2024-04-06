 class anonymos {
    void fact(int n){
        
        int u=1;
        
        for (int i = 1;i<=n;i++){
            u=u*i;
            


        }
        System.out.println(u);
        
    }
    public static void main(String[] args){
        new anonymos() . fact(5); 
    }
    
}
