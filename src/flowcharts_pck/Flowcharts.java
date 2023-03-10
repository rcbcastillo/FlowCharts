package flowcharts_pck;

public class Flowcharts {

	static int sumOrProduct(int a, int b, boolean c) {
		int result;
		if (c) {
			result = a + b;
			return result;
		} else {
			result = a * b;
			return result;
		}
	}

	static String flowchartEx(int A) {
		String result;
		String secondPrint;
		if (A <= 2000) {
			result = "l";
			System.out.println(result + "<-- first condition");
			if (A <= 100) {
				secondPrint = "3";
				System.out.println(secondPrint + "<-- second condition");
			} else {
				secondPrint = "2";
				System.out.println(secondPrint + "<-- second condition");
			}

		} else {

			result = "A";
			System.out.println(result + "<-- first condition");
		}
		return result;
	}

	public static void main(String[] args) {
		System.out.println(sumOrProduct(1, 2, true));
		System.out.println(sumOrProduct(3, 3, false));
		System.out.println(sumOrProduct(1, 1, true));
		flowchartEx(50);
		flowchartEx(150);
		flowchartEx(5000);

	}

}
