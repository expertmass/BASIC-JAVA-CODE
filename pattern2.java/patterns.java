import org.w3c.dom.css.Counter;

public   class patterns{

    // hollow pattern


  /*public static void hollow_rectangle(int totRow, int totCol){
       // for outer looop 
       for(int i=1 ;i<=totRow ;i++){
        // inner loop 
        for(int j=1; j<=totCol ;j++){
            if(i==1|| i==totRow || j==1 || j==totCol){
                //boundary cells
                System.out.print(" *");
            } else{
                System.out.print("  ");
            } 
        }
        System.out.println();
       } 
    }
public static void main(String args []){
           hollow_rectangle(5, 5);
}*/


// inverted roteted half  pryamid


/*
public static void roted_pryamid(int n){
    // outer loop
    for(int i=1; i<=n; i++){
        //inner looop one for the spaces
        for(int j=1; j<=n-i;j++){
            System.out.print("");
        }
         // inner loop two for the star
         for(int j=1; j<=i; j++){
            System.out.print("*");
         }
         System.out.println();
    }
}
 
public static void main(String args []){
    roted_pryamid(4);

    
}*/

// halfpryamid
/* 
public static void halfpryamid(int n){
    for(int i=1; i<=n;i++){
        for(int j=1; j<=n-i+1;j++){
            System.out.print(" "+j);
        }
        System.out.println();
    }
}

public static void main(String args []){
    halfpryamid(5);
    
    
}*/



// flyoed tringal pattern

/* 
public static void flyoedtringal(int n){
int counter=1;
for(int i=1;i<=n;i++){
    for(int j=1; j<=i;j++){
        System.out.print(" " + counter);
        counter++;
    }
System.out.println();
}
}
public static void main(String args []){
 flyoedtringal(10);
}
*/



// 0/1 tringal



/* 
 public static void zero_one(int n){
    for(int i=1; i<=n;i++){
        for(int j=1;j<=i;j++){
            if((i+j)%2==0){
                System.out.print(" 1");
            }else{
                System.out.print(" 0");
            }
        }
        System.out.println();
    }
 }

public static void main(String args []){
    zero_one(5);
}*/


// most important pattern butterfly  

/* 
public static void butterfly(int n){
  //1st half
  for(int i=1; i<=n;i++){
    //star -i
    for(int j=1; j<=i; j++){
        System.out.print("*");

    } 
    // space 2*(n-i)
    for(int j=1; j<=2*(n-i);j++){
        System.out.print(" ");
    }
    // statr -i
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
System.out.println();
  }
  // 2nd half
  for(int i=n;i>=1;i--){
     //star -i
     for(int j=1; j<=i; j++){
        System.out.print("*");

    } 
    // space 2*(n-i)
    for(int j=1; j<=2*(n-i);j++){
        System.out.print(" ");
    }
    // statr -i
    for(int j=1;j<=i;j++){
        System.out.print("*");
    }
System.out.println();
  }
}

public static void main(String args []){
 butterfly(10);
}*/



// solid rhombus 

 
  /*public static void solid_rhomnus(int n){
    for(int i=1;i<=n;i++){
        // spaces
        for(int j=1; j<=(n-i);j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=n;j++){
            System.out.print(" *");
        }
         System.out.println();
    }

}
public static void main(String args []){
    solid_rhomnus(8);
}
*/


 // hollow rhombus

 /* 
public static void hollowrhombus(int n){
    for(int i=1; i<=n; i++){
        //space
        for(int j=1;j<=(n-i);j++){
        System.out.print(" ");
        }
    // hollow rectangale - star
    for(int j=1; j<=n;j++){
        if( i==1|| i==n || j==1|| j==n){
            System.out.print("*");
        }
        else{
            System.out.print(" ");
        }
    }System.out.println();
}

   
}


public static void main(String args []){
    hollowrhombus(9);
}*/

// dimonf pattern
public static void dimond(int n){
    //1st half
    for(int i=1; i<=n;i++){
        //spaces
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=(2*i)-1;j++){
            System.out.print("*");
        }
         System.out.println();
    }
    // 2nd half 
    for(int i=n; i>=1;i--){
        for(int j=1;j<=(n-i);j++){
            System.out.print(" ");
        }
        // stars
        for(int j=1; j<=(2*i)-1;j++){
            System.out.print("*");
        }
         System.out.println();
}
}
public static void main(String args []){
    dimond(6);
}
}