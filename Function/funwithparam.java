import java.util.*;
public class funwithparam{
    public static int calculatesum(int num1, int num2){

          
            int sum = num1+ num2;
           return sum;
    }

    public static void main(String args[]){ // parameters or formal parameters
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=calculatesum(a, b);// argumentes or actual parameters
      
       System.out.println("sum is :" +sum);
   
    }

}
