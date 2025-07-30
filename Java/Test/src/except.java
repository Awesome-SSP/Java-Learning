
// Exception in Java

// public class MyException extends Exception{
    
//     String str1 ;
//     MyException(String str2)
//     {
//         str1 = str2;
//     }

//     public String toString()
//     {
//         return ("MyException was triggered ."+ str1 );
//     }
// }


public class except {
    // public static void main(String [] args)
    // {

    //     // // Simple example
    //     // int array[] = new int[10];

    //     // try{
    //     //     System.out.println(array[11]);
    //     // }
    //     // catch(ArrayIndexOutOfBoundsException error)
    //     // {
    //     //     System.out.println(error);
    //     // }

    //     // System.out.println("End");


    //     // Multiple catch block
    //     int array[] = new int [10];

    //     try{

    //         System.out.println(array[10]);
    //         int i = 10/0;

    //     }
    //     catch(ArrayIndexOutOfBoundsException error)
    //     {
    //         System.out.println("Array Index error");
    //         System.out.println(error);
    //     }
    //     catch(ArithmeticException error)
    //     {
    //         System.out.println("Maths Error");
    //         System.out.println(error);
    //     }

    //     System.out.println("End");
    // }




    // public static void main(String [] args) 
    // {
    //     try{
    //         fun();

    //     }
    //     catch(ArithmeticException error){
    //         System.out.println("Arithmetic Exception Triggered, oh yh!");
    //     }
    //     System.out.println("End!!");
    // }

    // public static void fun() throws ArithmeticException
    // {
    //     throw new ArithmeticException();
    // }


    // public static void main(String[] args)
    // {
    //     try{
    //         int i = 10/0;

    //     } 
    //     catch(ArithmeticException error)
    //     {
    //         System.out.println("Division by zero, very naughty (-_-)");
    //     }
    //     finally
    //     {
    //         System.out.println("oh yh, finally!");
    //     }
    //     System.out.println("End");
    // }


    public static void main(String[] args)
    {
        try{
           throw new MyException("This is my custom message");

        } 
        catch(MyException error)
        {
            System.out.println(error);
        }
        finally
        {
            System.out.println("oh yh, finally!");
        }
        System.out.println("End");
    }
}
