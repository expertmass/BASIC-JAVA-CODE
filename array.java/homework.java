

public class homework {
    public static void duplicte(int number[]){
        for(int i=0;i<number.length-1;i++){
               for(int j=1;j<number.length;j++){
                if(number[i]==number[j]){
                    System.out.println("true "+ number[i]);
                }
                else{
                    System.out.println("false");
                }
            }
        }
            
    }
    
    public  static void main(String args[]){
                int number[]={2,3,4,5,5};
               
                duplicte(null);
               
    }
    }
