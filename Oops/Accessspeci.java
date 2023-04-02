public class Accessspeci {
 public static void main(String args[]){
  bankAcount myacc=new bankAcount();
  myacc.userName="Praveen";
  myacc.setpass("hhaha");
  System.out.println(myacc);
 }   
}

class bankAcount{
   public String userName;
    private String Password;
 public void setpass(String pwd){
    Password=pwd;
 }

}