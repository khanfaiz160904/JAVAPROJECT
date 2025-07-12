package CodSoft;

public class Garbage1 {
	public static void main(String s[]) throws Exception {
		Runtime rs=Runtime.getRuntime();
		System.out.println("Total memory in jvm="+rs.totalMemory());
		System.out.println("free memory in jvm before garbage collection="+rs.freeMemory());
		System.gc();
		System.out.println("free memory in jvm after garbage collection="+rs.freeMemory());
	}
}
