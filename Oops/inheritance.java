public class inheritance {
    public static void main(String args[]){
     Fish Shark=new Fish();
     Shark.eat();
     //System.out.println(Shark);
    }
}
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    } 
    void breathe(){
        System.out.println("Breathe");
    }
}

// derived claass or sub class

class Fish extends Animal {
     int fins;
     void swim(){
        System.out.println("Swim in water");
     }
}