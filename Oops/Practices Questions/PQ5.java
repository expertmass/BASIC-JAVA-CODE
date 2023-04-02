public class PQ5 {
    public static void main(String args []){
  Vechile obj1 =new Car();
  obj1.print();
  Vechile obj2=new Vechile();
  obj2.print();
  
    }
}

class Vechile{
    void print(){
        System.out.println("basee class(Vechile)");
    }
}
class Car extends Vechile{
    void print(){
        System.out.println("Derivied class (car)");
    }
}