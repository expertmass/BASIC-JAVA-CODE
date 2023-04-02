public class PQ6 {
    public static void main(String args []){
  Vechile obj1 =new Car();
  obj1.print();
 
  
    }
}

class Vechile{
    void print(){
        System.out.println("basee class(Vechile)");
    }
}
class Car extends Vechile{
    void print1(){
        System.out.println("Derivied class (car)");
    }
}