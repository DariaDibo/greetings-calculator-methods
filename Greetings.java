
public class Greetings {
	
	static void greetingInEnglish() {
		System.out.println("- Hello!");
	}
	
	static void greetingInRussian() {
		System.out.println("- Здравствуйте!");
	}
	
	static void byeInEnglish() {
		System.out.println("- Goodbye!");
	}
	
	static void byeInRussian() {
		System.out.println("- До свидания!");
	}
	
	static void printDivider() {
		System.out.println("################");
	}

	public static void main(String[] args) {
		
		printDivider();
		//HW1
		System.out.println("HW1:");
		int n;
		for (n=1; n<=10; n++) {
			if (n==3) {
				continue;
			}
			System.out.println(n);
		}
		
		//HW2
		printDivider();
		greetingInEnglish();
		byeInEnglish();
		printDivider();
		greetingInRussian();
		byeInRussian();
		printDivider();
		
	}

}
