import java.util.Scanner;

public class pattern {
    static Scanner sc=new Scanner(System.in);
    public static void main(Strings[] args) {
        int i,m=0,flag=0;      
        int n=24;//it is the number to be checked    
        m=n/2;      
        if(n==0||n==1){  
         System.out.println(n+" is not prime number");      
        }else{  
         for(i=2;i<=m;i++){      
          if(n%i==0){      
           System.out.println(n+" is not prime number");      
           flag=1;      
           break;      
          }      
         }      
         if(flag==0)  { System.out.println(n+" is prime number"); }  
        }

        
    }
      
    static void pyramidFull(){
        
    int rows=sc.nextInt();
        for (int i=1;i<=rows;i++){
            for(int j=1;j<=(rows-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                if(k!=1 && k==(i+1)/2){
                System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
                
            }
            System.out.println("\n");
        }
    }


    static void diamond(){
        System.out.println("enter rows for diamond");
        int row=sc.nextInt();
        int rows=(row+1)/2;


        for (int i =1;i<=rows;i++){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                System.out.print("*");
            }
            System.out.println("\n");
        }
        for(int i=rows-1;i>=1;i--){
            for(int j=1;j<=rows-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                
                System.out.print("*");

            }
            System.out.println(" \n");
        }
    }

    static void reverseStr(String str){
        String reversedStr="";
        for(int i=0;i<str.length();i++){
            reversedStr=str.charAt(i) + reversedStr;
        }
        System.out.println(reversedStr);
    }
}




