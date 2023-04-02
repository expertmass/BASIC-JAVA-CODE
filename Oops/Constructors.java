public class Constructors {
    public static void main(String args[]){
     Student s1=new Student();
     Student s2=new Student("Praveen");
     Student s3=new Student(73);
     System.out.println(s1.name);
    }
}
class Student{
    String name;
    int roll;

    

    // non parameterside constructors
    Student(){// constructor
        System.out.println("constructor is print.....");

        
    }

    // parameterised constructor
    Student(String name){// constructor
         this.name=name;
    }

    Student(int roll){
        this.roll=roll;
    }
}