
public class CalculatorMethodsApp {
	
	static void printResult(int result) {
		if(result < 100_000_000 ) {
			System.out.printf("Result: %08d\n", result);

		}
		else {
			System.out.println("ERROR!");
		}
	}
	
	static void printDivider() {
		System.out.println("################");
	}
	
	static int add(int a, int b) {
		int r = a + b;
		return r;
	}
	
	static int sub(int a, int b) {
		int r = a - b;
		return r;
	}
	
	static int mul(int a, int b) {
		int r = a * b;
		return r;
	}
	
	static int div(int a, int b) {
		int r = a / b;
		return r;
	}
	
	static int pow(int v, int e) {
		int i, p;
		p = 1;
		for (i=1; i <= e; i++) {
			p *= v;			
		}
		return p;
	}
	
	public static void main(String[] args) {
		printDivider();
		printResult(sub(add(div(mul(pow(2,3),3),4),1),5));
		printDivider();
	}
}
