package practice;

public class Person {
	
	private String name;
	private int rollno;
	
	public Person (String name , int rollno) {
		this.name=name;
		this.rollno=rollno;
		
	}
	public Person (String name) {
		this(name,0);
		
	}
	public void display() {
		System.out.println("Name : "+this.name);
		System.out.print("rollno : "+this.rollno);
	}
	

	public static void main(String[] args) {
		Person obj1=new Person("freddy",112);
		Person obj=new Person("freddy");
		obj.display();
	}

}
