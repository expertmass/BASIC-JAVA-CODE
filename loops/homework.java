import java.util.*;
public class homework {
    public static void main(String[] args){
      Scanner sc=new Scanner(System.in);
//question:1 tell the what is output      
      
      /* for(int i=0; i<5; i++) {
        System.out.println("Hello");
        i+=2;
        }
         */ 


 //Question 2:    Write a program that reads a set of integers, and then prints the sum of the
               //even and odd integers   
       /* 
        int number;
        int choice;
        int evensum=0;
        int oddsum=0;
    

        do{
            System.out.println("enter the number");
            number =sc.nextInt();
            if(number % 2==0){
                evensum+=number;
            }else {
                oddsum+=number;
            }
            System.out.print("Do you want to continue? Press 1 for yes or 0 for no");
            choice = sc.nextInt();
            } 
            while(choice==1);
            System.out.println("Sum of even numbers: " + evensum);
            System.out.println("Sum of odd numbers: " + oddsum);
            }
        }*/

// question:3 factorial of a number 
    
     
    /*  int fact=1;
     System.out.println("enter numbe ehich you want fact");
     int n=sc.nextInt();

     for(int i=1; i<=n; i++){
        fact = fact*i;

     }
     System.out.println("factorial of a numberis : " + fact);
 */



 // Question 4 : Write a program to print the multiplication table of a number N, entered by the user.
      
 /*System.out.println("enetr a number");
     int num=sc.nextInt();
     int mul=1;
     for(int i=1; i<=10;i++ ){
           mul=i*num;
           System.out.println( mul);
     }

     */       
    
 //Question 5 :What is wrong in the following program?  
 
 for(int i = 0; i <= 5; i++ ) {
    System.out.println("i = " + i );
    }
       int i=0;
    System.out.println("i after the loop = " + i );


    }
}      

