public class HierarchicalInheritance {
    
    public static void main(String args[]){
       
           Fish fi = new Fish();
          fi.eat();
          Mammal ma=new Mammal();
          ma.walk();
          ma.eat();
          Bird bi=new Bird();
          bi.breathe();
          bi.fly();
       

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
    void walk(){
        System.out.println("WALKS");
    }
    
}
class Fish extends Animal{ // derived class 2
    void swim(){
        System.out.println("swim");
    }
    
}
class Bird extends Animal{ // derived class 3
    void fly(){
        System.out.println("FLY");
    }
    
}