package basic;

import java.util.Scanner;

public class check_vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
        
        
        System.out.println("enter the char");
        char val = sc.next().charAt(0);
        char[] arr = {'a','e','i','o','u'};
        for(int i =0;i<arr.length;){

            if(val==arr[i]){
                System.out.println("value is vowel");
                break;
            }
            else if(i==arr.length-1){
                System.out.println("value is consonant");
                break;
            }
            else{
                i++;
            }
        }
    }
    }
    
}
