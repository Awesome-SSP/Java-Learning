/*
 * what is method and how it is defined?
 * method overloading
 */

public class method {
    public static void main(String[] args){
        fun1();
        fun2(23.5f, 45.89f);
        int a = returnFunction();
        System.out.println(a);

        // hello(23);
        // hello(12,45);
        // hello(true);

        // for(String str: args){
        //     System.out.println(str);
        // }

        adder(1,2,3,4,5,6,7);
    }

    public static void fun1(){
        System.out.println("hello \t INDIA");
    }

    public static void fun2(float var1, float var2){
        System.out.println(var1*var2); 
    }

    public static int returnFunction(){
        int x=8;
        return 6*2 +x;
    }

    // Method overloading
    public static void hello(int x){
        System.out.println(x);
    }

    public static void hello(int x, int y ){
        System.out.println("Hello"+ (x+y));
    }
    public static void hello(boolean x ){
        if (x == true){
            System.out.println("it is true");
        }
        else
        System.out.println("it is false");
    }


// multiple arguments passing
    public static void adder(int... numbers){
        int total = 0;
        if(numbers.length == 0){
            System.out.println("please pass some information");
            return;
        }
        
        for (int num: numbers){
            total += num;
            }
        

        System.out.println(total);
    }
}
