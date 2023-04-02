public class PowerOrNot {
    public static boolean isPowoftwo(int n){
        return (n&(n-1))==0;

    }
    public static void main(String args[]){
        System.out.println(isPowoftwo(12));

    }
    
}
