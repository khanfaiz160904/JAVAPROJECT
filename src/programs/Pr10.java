package programs;

public class Pr10 {
	private int age;

	public Pr10() {
		
	}

	Pr10(int age) {
		this.age = age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
		
	}
	public static void main(String[] args) {
		Pr10 e=new Pr10();
		e.setAge(30);
		int age=e.getAge();
		System.out.println(age);
	}
}
