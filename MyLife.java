package homework1;

public class MyLife {

	int age;
	String dreamcity;
	String name;
	String hometown;
	String schoolname;
	

	public void sayAge(int age) {
		System.out.println("You are " + age + " years old.");
	}
	
	public void Dreamcity(String dreamcity) {
		this.dreamcity = dreamcity;
	}
	
	public void sayVacation() {
		System.out.println("You are going to fly on Emirates first class and go to " + dreamcity);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void getHometownandSchoolname(String hometown, String schoolname) {
		System.out.println("Hey " + name + ", you are from " + hometown + " and you go to " + schoolname);
	}

}
