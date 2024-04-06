
import java.util.Stack;

import javax.naming.ldap.SortControl;

import java.io.*;

// public class removing_adjecent_char {
//      static String removeAdjChar(String str) {
//         Stack<Character> stack = new Stack<>();
//         int i;
//         stack.push(str.charAt(0));
//         for (i = 1; i < str.length(); i++) {
//             if (stack.peek() == str.charAt(i)) {
//                 stack.pop();
//                 continue;

//             }
//             stack.push(str.charAt(i));
//         }
//         StringBuffer bfr = new StringBuffer();

//         while(!stack.isEmpty()){
//             bfr.append(stack.pop());

//         }
//         return bfr.reverse().toString();
//     }

//     public static void main(String[] args) {
//         BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        
//             String str;
//             System.out.println("Enter the string : ");
//             try {
//                 str = b.readLine();

//             } catch (Exception e) {
//                 System.out.println("An error occured : ");
//                 return;
//             }

        

//         String a = removeAdjChar(str);
//         System.out.println("The final charcter is : " + a);

//     }

// }

// int popout(int str){
//     Stack <character> s= new Stack<>();
//     int i;
//     s.push(str.charAt(0));
//     for(i=0;i<str.length();i++){
//         if(s.peek()==s.chaAt(i)){
//             s.pop();
//             continue;

//         }
//         s.push(charAt(i));
//     }
//     StringBuffer bfr = new StringBuffer();

//     while(!s.peek()){
//         bfr.append(s.pop());



//     }
//     return s.reverse().toString();




// }
