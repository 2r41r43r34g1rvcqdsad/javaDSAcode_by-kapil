import java.io.*;

// public class deleting_words {

//     static String removeCharacter(String str1, String str2){
//             int [] arr= new int [323];
//             for(int i=0;i<str2.length();i++){
//                 arr[str2.charAt(i)]++;           // itrreting the theought array 

//             }
//             String output =" " ;

//             for (int i=0;i<str1.length();i++){

//                 if(arr[str1.charAt(i)]==0){    // if condition will be true 
//                     output+=str1.charAt(i);
//                 }

//             }

//             return output;
//         }

//     public static void main(String[] args) {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         String str1, str2;
//         System.out.println("Enter First string: ");
//         try {
//             str1 = br.readLine();
//         } catch (Exception e) {
//             System.out.println("An error occured :");
//             return;

//         }
//         System.out.println("Enter second String :");

//         try {
//             str2 = br.readLine();
//         } catch (Exception e) {
//             System.out.println("As error occured :");
//             return;

//         }
//         String output = removeCharacter(str1, str2);
//         System.out.println("The Final String is :  " + output);

//     }

// }

// public class deleting_words {
//     String remove_words(String str1, String str2){
//         int arr[] = new int[4232];
//         String output;
//         for (int i-0;i<str2.length();i++){   // itrrteing the second string therough the string
//             arr[str2.cahrAt(i)]++;
//         }

//         for (int i=0;i<str1.length();i++){
//             if(arr[str1.length()]==0){          // if condetion will be true
//                 output= output+str1.cahrAt(i);
//             }
//         }

//         return output;

//         public static void main(String[] args) {
//             BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//             String output, str1,str2;
//             try{
//                 str1 = br.readLine();
//             }
//             catch(Exception e){
//                 System.out.println("त्रुटि ");
//                 return;
//             }

//             try{
//                 str2 = br.readline();

//             }
//             catch (Exception e){
//                 System.out.println("त्रुटि");
//         }

//         }

//         output= remove_words(str1, str2);
//         System.out.println("The final string is : "+ output);

//     }
// }

public class deleting_words {
     static String dell(String str1, String str2) {
        int arr[] = new int[5342];
        for (int i = 0; i < str2.length(); i++) {
            arr[str2.charAt(i)]++;

        }
        String out = " ";
        for (int i = 0; i < str1.length(); i++) {
            if (arr[str1.charAt(i)] == 0) { // if condition is true
                out = out + str1.charAt(i);
            }
            
        }
        return out;

    }

    public static void main(String[] args) {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        String str1, str2;
        try {
            str1 = r.readLine();
        } catch (Exception e) {
            System.out.println("An error accoured :");
        }
        try {
            str2 = r.readLine();

        } catch (Exception e) {
            System.out.println("An eeror occured :");
        }

        String out = dell(str1, str2);

        System.out.println("The final string is :" + out);
    }

}
