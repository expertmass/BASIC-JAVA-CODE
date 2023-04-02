public class printInc {
    public static void PrintIncr(int n){
        if(n==1){
            System.out.print(n+" ");
             return;
        }
        PrintIncr(n-1);
        System.out.print(n+" ");
    }
    public static void main(String args[]){
      int n=500;
     PrintIncr(n);
    }
}
