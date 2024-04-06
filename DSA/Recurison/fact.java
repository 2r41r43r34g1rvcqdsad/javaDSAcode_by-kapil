package Recurison;

public class fact {
    public static void main(String[] args) {
        int ans = facto(2341);
        System.out.println(ans);
    }
//     static int facto(int n){
//         if(n<=1){
//             return 1;//1 for multiplication // 0 for addition
//         }
        
        
//         //return n*facto(n-1); // factorial of n numbers
//        // return n+facto(n-1); // sum of n numbers
//       // return (n%10)+facto(n/10); // sum of the indivisual value
//        return (n%10)*facto(n/10); // product of the indivisual number
//     }
// }


static int facto(int n){
    if(n<=1){
        return 1;
    }
    return (n%10)*facto(n/10);
}
}
