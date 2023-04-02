import javax.sql.rowset.spi.SyncResolver;

public class abstractorNonabstraction {
    public static void main(String args[]){

         //Horse ho=new Horse();
        // ho.walk();
        // ho.eat();
        // System.out.println(ho.color);


         //Hen he=new Hen();
        // he.walk();
         //he.eat();

         Mustang mu =new Mustang();


        }
    }
abstract class Animal{
    String color;
    
    Animal(){
        System.out.println("Animal constructor called");
    }
void eat(){
    System.out.println("Every one eat");
}
 abstract void walk();
}


class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructor called");
    }
    void changeColor(){
        color="Green";
    }
    void walk(){
        System.out.println("WALK ON FOUR LEGS");
    }
}



class Hen extends Horse{
    void changeColor(){
        color="blue";
    }
   void  walk(){
        System.out.println("WALK ON TWO LEGS");
    }
}

class Mustang extends Hen{
    Mustang(){
        System.out.println("Mustang constructor caled");
    }
}