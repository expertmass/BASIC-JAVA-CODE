import java.util.*;

public class incometaxcal {
    public static void main(String args[]){
    Scanner sc= new Scanner(System.in);
    int tax = 0;
    int income= sc.nextInt();
   
    if(income<500000){
        tax =0;
       //25000 System.out.println(" TAX IS ZERO ");
    }
    else if(income >= 500000 && income <1000000){
       tax = (int)(income * 0.2);
        //System.out.println("TAX IS =" + tax);
    }
    else{
        tax = (int)(income* 0.3);
       
    }
     System.out.println("TAX IS :" + tax);
}
}
