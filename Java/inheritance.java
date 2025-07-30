public class superClass{
int a = 7;
public void add(int a,int b){return a+b;}

}



public class subClass extends superClass{
	public static void main(String[] args){

subClass s = new subClass();
Sysytem.out.println("Programmer Salary: "+s.a);
System.out.println("Bonus of Programmer is:" +s.add(2,5));

}



}