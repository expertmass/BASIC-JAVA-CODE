public class Oops{
public static void main(String args[]){
    Pen p1=new Pen();//constructor special type functionor // creat objrct with name p1

    p1.setColor("Blue");
    System.out.println(p1.color);
    p1.setTip(5);
    System.out.println(p1.tip);
    //p1.setColor("Blue");
    p1.color="Yellow";
    System.out.println(p1.color);

}
}
class Pen {
    //function + properity
    String color;
    int tip;
    void setColor(String newColor){
        color=newColor;
    }
     void setTip(int newTip){
       tip= newTip;
     }
}
class Student{
    String name;
    int age;
    float percentage;//cgpa

    void clcPercantage(int phy, int chem, int math){
        percentage=(phy+chem+math)/3;
    }

}