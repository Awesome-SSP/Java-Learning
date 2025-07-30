public class EncapTest{

	private String name;
	private String idnum;
	private int age;

	public int getAge() {
	return age;
	}
	
	public String getName(){
	return name;
	}

	public String getIdNum(){
	return idNum;
	}


	public void setAge (int newAge){age newAge;}

	public void setName(String newName){name = newName;}

	publilc void setIdNum(String newId){idNum = newId;}
}







public class runClass{

	EncapTest encap = new EncapTest();
	encap.setName("james");
	encap.setAge(20);
	System.out.print("Name:" + encap.getName()+"Age: "+ encap.getAge());

}