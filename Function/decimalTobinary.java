



public class decimalTobinary {   

  public static void decTobin(int n){
    int  mynum=n;
    int pow=0;
    int binNum=0;
    while(n>0){
        int rem=0;
        rem =n%2;
        binNum=binNum + (rem*(int)Math.pow(10,pow));
        pow++;
        n=n/2;
    }
    System.out.println("binary form of " + mynum + "="+ binNum) ;
  }


     public static void main(String args[]){
        decTobin(11);

    }
}
