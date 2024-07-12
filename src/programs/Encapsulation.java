package programs;

public class Encapsulation {
	private int age;

	public Encapsulation() {
		
	}

	Encapsulation(int age) {
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
		
	}
	public static void main(String[] args) {
		Encapsulation e=new Encapsulation();
		e.setAge(30);
		int age=e.getAge();
		System.out.println(age);
	}
}
