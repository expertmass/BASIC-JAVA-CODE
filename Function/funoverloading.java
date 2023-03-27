// FUNCTION OVERLOADING WITH THE YA BY USING "PARAMEETER"
public class funoverloading {
 /*  //this id for only sum of 2 numbers
    public static int sum(int a, int b){
        return a+b;
    }
    */
    //tis function for sum of three number
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    //FUNCTION OVERLOADING BY USING "DATA TYPE"
    public static int sum(int a, int b){
        return a+b;

    }
    public static float sum(float a, float b, float c){
        return a+b+c;
    }
    public static void main(String args []){
       System.out.println(sum(5,3));
       System.out.println(sum(4.0f,1.5f,1.5f));
    }
    
}
