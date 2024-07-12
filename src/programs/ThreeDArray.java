package programs;

public class ThreeDArray {
	public static void main(String[] args) {
		int [][][]a={{{1,2,3},{4,5,6}},{{7,8,9}}};
		for(int i=a.length-1;i>=0;i--) {
			for(int j=a[i].length-1;j>=0;j--) {
				for(int k=a[i][j].length-1;k>=0;k--) {
					System.out.println(a[i][j][k]);
				}
			}
		}
	}

}
