import java.util.*;
public class homework{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        //System.out.println("Enter a number..");
        


       // question 1 ---> check nuber negative or positive 
        /* 



        int number =sc.nextInt();
       
         if(number<0){

            System.out.println("Number is negative");
         }
         else{
            System.out.println("number is positive");
         }
        */
                






       // Question 2:  if your temperature




            //is above 100 and otherwise prints You don't have a fever 
        /*  System.out.println("enter your temperature");
         double temp =103.5;
         //double temp = sc.nextDouble();
           
         if(temp>103.5){
            System.out.println("You have fever go to hospital !!");
         }
         else{
            System.out.println("You don't have fever :)");
         }
         */

      

         //question 3:  Write a Java program to input week number(1-7) and print day of week name
           //using switch case.


           /* 
           System.out.println("Enter week day number");
           int week=sc.nextInt();
           switch(week){
            case 1: System.out.println("monday");
                    break;
            case 2: System.out.println("tuesday");
                    break;
            case 3: System.out.println("wednesday");
                    break;
            case 4: System.out.println("thursday");
                    break;
            case 5: System.out.println("friday");
                    break;
            case 6: System.out.println("suturday");
                    break;
            case 7: System.out.println("sunday");
                    break;
            default: System.out.println("wrong input"); 
           }

           */



       //question 4: output of given code




     /* 
       int a = 63, b = 36;
       boolean x = (a < b ) ? true : false;
       int y= (a > b ) ? a : b;
       System.out.println(x);
       System.out.println(y);
        

       */
       
       // question 5: leep yearc or not
           
       System.out.println("enetr the day in year");
       int year=sc.nextInt();
       

       boolean x = (year % 4) == 0;
       boolean y = (year % 100) != 0;
       boolean z = ((year % 100 == 0) && (year % 400 == 0));
             if(x && (y || z)) {
                 System.out.println(year + " is a leap year");
           } 
             else {
             System.out.println(year + " is not a leap year");
        }




       }
       





    
}