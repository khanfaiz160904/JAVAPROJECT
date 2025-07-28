package codSoft;

public class GetterSetExample {
	private int id;

	public int dliId() {
		return id;
	}

	public void bliId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		GetterSetExample getterSetExample = new GetterSetExample();
		getterSetExample.bliId(20);
		System.out.println(getterSetExample.dliId());
	}
}