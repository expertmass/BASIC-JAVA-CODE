public class oddorEven {
    public static void  EvenorOdd(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            //even number
            System.out.println("Even Number");
        }else{
            System.out.println("Number is odd");
        }
    }
    public static void main(String args[]){
        EvenorOdd(4);
        EvenorOdd(13);
        EvenorOdd(31); 
}
}