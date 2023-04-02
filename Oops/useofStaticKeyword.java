public class useofStaticKeyword {
    public static void main(String args[]){

        Student s1=new Student();
        s1.schoolName="iic";
        Student s2= new Student();
        System.out.println(s2.schoolName);

        Student s3=new Student();
        s3.schoolName="KIC";
    }
}

class Student{
    static int returnPercantage(int math, int phy, int chem){
        return (math+phy+chem)/3; //NOTE : --> by static keyword we dont need again anagin creation of Percentage function
    }
    String name;
    int roll;
  
    static String schoolName;
    void setName(String name){
        this.name=name;
    }
   
    String getName(){
        return this.name;
    }
}