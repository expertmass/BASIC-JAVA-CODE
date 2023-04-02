import javax.sql.rowset.spi.SyncResolver;

public class multilevalInheritamce {
    public static void main(String args[]){
       
           Dog juli = new Dog();
           juli.eat();
           juli.legs=4;
           System.out.println(juli.legs);

       }
   }
   class Animal{    // parent class
       String color;
       void eat(){
           System.out.println("Eats");
       } 
       void breathe(){
           System.out.println("Breathe");
       }
   }
class Mammal extends Animal{ // derived class 1
    int legs;
    
}
class Dog extends Mammal{ // derived class2 from derived class1 (and DC1 is also derived  from parents class)
    String breString;
}
