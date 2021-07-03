public class Main {
	public static void main(String[] args) {
		int number = 1;

		// WHILE
		System.out.println("WHILE");
		while (number <= 10) {
			System.out.print(number);
			number++;
		}
		System.out.println();

		// DO...WHILE
		System.out.println("DO...WHILE");
		number = 1;
		do {
			System.out.print(number);
			number++;
		} while (number <= 10);
		System.out.println();


		// FOR
		System.out.println("FOR");
		number = 1;
		for (number = 1; number <= 10; number++) {
			System.out.print(number);
		}
		System.out.println();


		// FOR EACH
		System.out.println("FOR...EACH");
		int[] numbers = { 1, 2, 3, 4, 5 };
		int sum = 0;
		for (int num : numbers) {
			sum = sum + num;
		}
		System.out.println("Sum is " + sum);

		// BREAK
		System.out.println("BREAK");
		String[] colors = new String[] { "red", "orange", "blue", "green" };
		for (String color : colors) {
			if ("blue".equals(color)) {
				break;
			}
			System.out.println(color);
		}

		// CONTINUE
		System.out.println("CONTINUE");
		String[] colors2 = { "red", "orange", "blue", "green" };
		for (String color : colors2) {
			if ("blue".equals(color)) {
				continue;
			}
			System.out.println(color);
		}
	}
}
