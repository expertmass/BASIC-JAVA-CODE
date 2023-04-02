public class multipaleInherByInterface {
    public static void main(String args[]){
   Child ch= new Child();
   ch.eat();
   ch.drink();
    }
}
interface Father{
    void eat();
}
interface Mother{
    void drink();
}

class Child implements Father, Mother{// we can creat multipal interface by ,
   public  void eat(){
        System.out.println("eats food");
    }
   public  void drink(){
        System.out.println("drink water");
    }

}