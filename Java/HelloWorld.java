public class HelloWorld{
	public static void main(String[] args){		

	HelloWorld x = new HelloWorld();
	int sum = x.add(12,56);

	System.out.println("Hello World! \n The sum  is " + sum);	
	}

	public int add(int a, int b){
	
	int sum = a+b;
	return sum;
	}
 
}