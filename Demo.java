public class Demo {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				num += i;
			}
		}
		System.out.println("100以内的偶数和为" + num);

	}

}
