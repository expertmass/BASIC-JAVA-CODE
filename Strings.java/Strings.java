import java.util.*;

import javax.swing.text.StyleConstants; 
public class Strings{
    public static void printletters(String str){
        for(int i=0; i<str.length();i++){
            System.out.print(str.charAt(i) + " ");
        }
        System.err.println();
    }
    public static void main(String args[]){
     /*char arr[]={'a','b','c','d'};
     String str="abcd";
     String str2= new String("xyz@#$123"); 
         // java string are IMMUTABLE

         Scanner sc=new Scanner(System.in);
         String name;
         name =sc.nextLine();
         System.out.println(name);*/

         //  we get also length of string by usiing length() function 
             
         
               //String fullNmae="Praveen";
               //System.out.println(fullNmae.length());
      

// concatanation of two strngs && use of Char at

String firstName= "123456";
String lastName= "bhardwaj";
String fullNmae = firstName + " :) "+ lastName;
printletters(fullNmae);



    }
}