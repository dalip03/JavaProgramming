import java.util.Scanner;

public class ConditionalConstructs {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter Your Name:)  ");
		String name = scanner.nextLine();
		System.out.println("hello "+name);
		
		
		System.out.println("Enter an Amount: ");
		double amount = scanner.nextDouble();
			System.out.println("Your Amount Is : \u20b9"+amount);
		
		System.out.println("Enter Your PROMOCODE: ");
		String promocode = scanner.nextLine();
		

	}

}
