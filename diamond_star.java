package basic;

import java.util.Scanner;

public class diamond_star {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the diamond");
        int n = sc.nextInt();
        
int s =0;
     if(n%2!=0){
        s = n/2;
        s=s+1;
        
      

     

        
     

        for(int i =1;i<=s;i++){
            for(int j=0;j<s-i;j++){
                System.out.print(" ");
                
            }
            for(int w=1;w<=i;w++){
                System.out.print(" *");
                
            }
            System.out.println();



        
        }

        for(int e =1;e<=n-s;e++){
            for(int r =0;r<e;r++){
                System.out.print(" ");
            }
            for(int t=1;t<=(s-e);t++){
                System.out.print(" *");   
            }
        System.out.println();    
        }
    }
    else{
        s=n/2;

        for(int i =1;i<=s;i++){
            for(int j=0;j<s-i;j++){
                System.out.print(" ");
                
            }
            for(int w=1;w<=i;w++){
                System.out.print(" *");
                
            }
            System.out.println();



        
        }

        for(int e =0;e<n-s;e++){
            for(int r =0;r<e;r++){
                System.out.print(" ");
            }
            for(int t=1;t<=s-e;t++){
                System.out.print(" *");   
            }
        System.out.println();    

    }
    }
}
}
