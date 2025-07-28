package codSoft;

class DuplicateElements {
	public static void main(String[] args) {
		String sr = "abcd";
		String sr1 = "cdef";

		char a[] = sr.toCharArray();
		char b[] = sr1.toCharArray();

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {

				if (a[i] == b[j]) {
					System.out.println(a[i] + " is duplicate");
				}

			}
		}

	}
}