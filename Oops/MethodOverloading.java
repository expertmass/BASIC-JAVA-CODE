public class MethodOverloading {
    public static void main(String args[]){
           Calculator cal= new Calculator();
           System.out.println(cal.sum(2, 2));
           System.out.println(cal.sum((float)2.5, (float)2.5));
           System.out.println(cal.sum(2, 2,3));

    }
}
class Calculator{//compile time polymorphism
    int sum(int a ,int b){
        return a+b;
    }
    float sum(float a, float b){
        return a+b ;
    }
    int sum(int a ,int b,int c){
        return a+b+c;
    }
    
}
