package codSoft;

public class Emp {
	int a;
	String b;
	Emp(int a,String b){
		this.a=a;
		this.b=b;
		System.out.println(a);
	}
	public static void main(String[] args) {
		Emp emp = new Emp(1, "a");
		System.out.println(emp.a+" "+emp.b);
	}
}