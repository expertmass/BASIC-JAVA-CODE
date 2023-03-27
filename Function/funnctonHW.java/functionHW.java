import java.util.*;

public class functionHW {
    //question 1: make a method to calculate avg of threee number
   /*  public static int Avg(int a, int b, int c){
              int avg=0;
             avg=(a+b+c)/3;
         
       return avg;
    }
    public static void main(String args[]){
       int  a=10;
       int  b=20;
       int  c=10;
       int avgsum=Avg(a, b, c);
         System.out.print(avgsum);*/


// Question 2: number even or odd


      /*  System.out.println("Enetr a number which want you check odd or even ");
       int num=sc.nextInt();
       if(isEven(num)){
        System.out.println("number is even");
       }else{
        System.out.println("number is odd");
       }

}

public static boolean isEven(int number){
    if(number %2==0){
        return true;
    }
    else{
        return false;
    }
}*/

/*
// question 3: check number is palindrom or not




System.out.println("Please Enter a number : ");

int palindrome = sc.nextInt();
if(isPalindrome(palindrome)) {
System.out.println("Number : " + palindrome + " is a palindrome");
} else {
System.out.println("Number : " + palindrome + " is not a palindrome");
}
}


public static boolean isPalindrome(int number) {
int palindrome = number; // copied number into variable
int reverse = 0;

while (palindrome != 0) {
int remainder = palindrome % 10;
reverse = reverse * 10 + remainder;
palindrome = palindrome / 10;
}
   // if original and the reverse of number is equal means
// number is palindrome in Java
if (number == reverse) {
    return true;
    }
    return false;
   
   }  


    */


    // queston5: sum the given numbers 

    
    
    public static int SumDigit(int n){
        int sumofdigit=0;
        while(n>0){
            int lastdigit=n%10;
            sumofdigit += lastdigit;
            n/=10;
        }
        return sumofdigit;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enetr numbers");
       int digit=sc.nextInt();
    System.out.println(" the  sum is"+ SumDigit(digit));
    
  

    }    
}

