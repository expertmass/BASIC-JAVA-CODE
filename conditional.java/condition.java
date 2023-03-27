import java.util.*;

import javax.swing.plaf.synth.SynthOptionPaneUI; 

public class condition {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
         /* 
         
         
         int age =17;
         if(age >=22){
            System.out.println("Adult : vote , drive");
         }
         if(age >=16){
            System.out.println("You are teenager");
         }
         else{
            System.out.println("Your are not adult");
         }*/
        
         // print the largest number in a b & c

         /* 
         int a=100 , b=30, c=31;
         if(a>b && a>b){ 
            System.out.print("A is greater");
         }

         if(b>a && b>c){
            System.out.print(" B is greater");
         }
         else{
            System.out.print("C is greter");
         }

           */

           //   print odd or even number
           
           /* 
           int number=sc.nextInt();
           if(number%2 == 0){
            System.out.println("Number is ----> EVEN ");
           } 
           else{
            System.out.println("number is -------> ODD");
           */
       



           //else if  statment

           int age =12;
           if(age >= 20 ){
            System.out.println("Adult");

           }
           else if(age >= 13 && age < 18){
            System.out.println("TEENAGER");
           }
           else{
            System.out.println("CHILD");
           }

    }
    
}
