/*
 * in this we have for loop , while loop, do-while loop
 * example about character , string , for each loop
 * Regular Expressions
 */

import java.util.Date;
//import java.util.Calendar;
import java.util.regex.*;


public class win {


    // public static void main(String [] args){
    //     // Switch case
    //     /* 
    //     int x = 1;
    //     switch(x){
    //         case 0:
    //         System.out.println("the value is zero");
    //         break;
    //         case 1:
    //         System.out.println("value is one");
    //         break;

    //         default:
    //         System.out.println("no matched value");
    //         break; 
    //      } */


    //     // for loop
        
    //     for(int i = 0; i<100;i++){
    //         System.out.println(i);
    //     }
        
    //     // While loop

    //     int i= 10;
    //     while(i > 0){
    //         System.out.println("hello world");
    //         i--;
    //     }
    //     // Do - While loop 
    //     System.out.println(i);
    //     do{
    //         System.out.println("I am in do- While");
    //     }while(i>2);

    //     float m = 569.45f;

    //     // round
    //     System.out.println(Math.round(m));

    //     // Log
    //     System.out.println(Math.E);
    //     System.out.println(Math.log(100));

    //     // power
    //     System.out.println(Math.pow(m,5));

    //     // Square root
    //     System.out.println(Math.sqrt(4));

    //     // Sine (tringonometry)
    //     double pi = Math.PI;
    //     System.out.println(pi);
    //     System.out.println(Math.sin(pi));

    //     char  c = '\t';
    //     System.out.println(c +"hello"+ c +"welcome");

    //     char awesome = 'b';
    //     System.out.println(Character.isLetter(awesome));
    //     System.out.println(Character.isUpperCase(awesome));

    //     //  Convert lowercase to uppercase
    //     System.out.println(Character.toUpperCase(awesome));

    //     // String 

    //     String str = "Hello World";
    //     System.out.println(str);

    //     // Character location
    //     System.out.println(str.charAt(0)); 
    //     // String length
    //     System.out.println(str.length());

    //     // Convert string to uppercase
    //     System.out.println(str.toUpperCase());

    //     // Convert string to lowercase
    //     System.out.println(str.toLowerCase());
    // }  


    public static void main(String[] args){

        // int arr[] or int[] arr they are the same

        // int [] arr = {1,2,3,4,5,6, 7, 8, 9, 10, 22};
        // System.out.println(arr[0]);

        // System.out.println(arr.length);

        // // loop through the array and print out all values
        // for (int i =0; i< arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }


        // // for each loop
        // float arr[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f, 6.0f};
        // for(float e: arr)
        // {
        //     System.out.println(e);
        // }



        // date-time
        Date d = new Date();
        System.out.println(d.toString());

        System.out.println(d.getTime());

        // System.out.println(d.getYear());

        Pattern pat = Pattern.compile("..d");
        Matcher mat = pat.matcher("God");

        // First Method
        boolean result1 = mat.matches();
        System.out.println(result1);

        // Second method
        boolean result2 = Pattern.compile("..d").matcher("God").matches();

        System.out.println(result2);

        // Third method 
        boolean result3 = Pattern.matches("..d","God");
        System.out.println(result3);
        

    }
}
