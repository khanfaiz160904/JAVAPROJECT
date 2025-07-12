 package programs;

public class IndexMulti {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b,c=0;
		for(int i=0;i<a.length;i++) {
			b=a[i]*i;
			c+=b;
		}
		System.out.println(c);
	}
}
