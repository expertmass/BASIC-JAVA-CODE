public class hybirdInheritance {
    
    public static void main(String args[]){
       
        Fish fi = new Fish();
       fi.eat();
       Mammal ma=new Mammal();
       ma.walk();
       ma.eat();
       Bird bi=new Bird();
       bi.breathe();
       bi.fly();
     Human hu=new Human();
     hu.breathe();
     hu.eat();
     hu.walk();

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
class Dog extends Mammal{ // derived class 1
    void dog(){
        System.out.println("dog");
    }
    
   }
   class Cat extends Mammal{ // derived class 1
    void cat(){
        System.out.println("cat");
    }
    
   }
   class Human extends Mammal{ // derived class 1
    void walk(){
        System.out.println("Having brain");
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
