import java.util.*;
public class loops{
    public static void main( String args[]){
     Scanner sc = new Scanner(System.in);
 //Print 10 time hello word with help of while looop


    /*  int cout=0;
      while(cout<10){
        System.out.println("hello world!");
        cout++;  // update if you not update then looop stuck in infinty loop
     
    }
          */

       
// print 1 to 10 number

          /* 
          int cout=1;
      while(cout<=100){
        System.out.println(cout);
        cout++;
      }
      System.out.println("complited :)");


      */






 //print  1 to n

      /* 
      System.out.println("enter value of n");
      int rang =sc.nextInt();
      int cout=1;
      while(cout <= rang){
        System.out.println(cout);
        cout++;
      }
      */

 //sum of matural number
       /*      System.out.println("enter n");
      int n=sc.nextInt();
      int sum=0;
      int i=1;
      while(i<=n){
        sum=sum+i;
         }
      System.out.println(sum);
     
      */

//  FOR LOOP
          //  print 10 time hii with the for loop 
       
       
       /*   int i=1;
       for(i=1;i<10; i++){
        System.out.println("hii!");
       }
       
       */ 
// print star square pattern

          /* 
     for(int line=1;line<=4;line++){
        System.out.println("****");
     }
       */

 // print revrse of a number

      
      // if you want last digit num%10
      //if you want last digit(remove) num/10
          
      /* 
      
      
          int n=2345;
           while(n>0){
            int lastdigit=n%10;
            System.out.print(lastdigit);
            n=n/10;//n/=10
           }
           
 */          
// reverse a actual number 

             /* int rev=0;
             int n=452003;
             while(n>0){
                int lastdigit=n%10;
                rev=(rev*10)+lastdigit;
                n=n/10;
             }
           System.out.println(rev);
            */

// do while loop
               
          
          /* int cout=0;
               do{
                System.out.println("hello !!");
                cout++;
               }while(cout<=10);
             */
// brek statment 
                
             /*for(int i=0; i<=5; i++){
                if(i==4){
                    break;
                }System.out.println(i);
             }System.out.println("i am out of loop");
            */

// break statment use in for loop
          /*do{
              System.out.println("enetr your number");
              int n= sc.nextInt();
              if(n%10==0){
                break;
              }
              System.out.println(n);
          }while(true);*/

  // to skip itraion with continue statemnt 
  
    /*for(int i=0;i<=5;i++){
        if(i==3){
            continue;
        }System.out.println(i);
    }*/

     do{
        System.out.println("enetr your number");
        int n=sc.nextInt();

        if(n%10==0){
            continue;

        }
        System.out.println("the number was" + n);
     }while(true);




}

}