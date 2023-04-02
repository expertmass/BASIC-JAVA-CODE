public class PQ2 {
    public static void main(String args []){
     
        Student s= new Student();
       s.name="hii";
       
    }
}
class Person{
    String name;
    int weight;
}
class Student extends Person{
    int rollNumber;
    String schoolName;
}

// answer is that:  name and weight only access person class