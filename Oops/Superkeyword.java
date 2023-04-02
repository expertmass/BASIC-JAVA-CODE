public class Superkeyword {
    public static void main(String args[]){
        Horse ho = new Horse();
        System.out.println(ho.color);
    }
 }
class Animal{
    String color;
    Animal(){
        System.out.println("animal constructor call ");
    }
}
class Horse extends Animal{
    Horse(){
        super.color="brown"; // super keyword by default call in java
        System.out.println("horse constructor calll");
    }
}