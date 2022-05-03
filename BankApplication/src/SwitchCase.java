import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {

		while (true) {
			System.out.println("##############################");
			System.out.println("##############################");
			System.out.println("Welcome to SBI Bank");
			System.out.println("Enter your choice");
			System.out.println("To create Account Press::1");
			System.out.println("To deposite  Money Press::2");
			System.out.println("To withdraw Money Press::3");
			System.out.println("To check Account Balance Press::4");
			System.out.println("##############################");
			System.out.println("##############################");

			Scanner scanner = new Scanner(System.in);
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("*********************************");

				System.out.println("Account is created");

				System.out.println("*********************************");

				break;

			case 2:
				System.out.println("*********************************");
				System.out.println("Money is deposited");
				System.out.println("*********************************");

				break;

			case 3:
				System.out.println("*********************************");
				System.out.println("Money  withdrawn");
				System.out.println("*********************************");

				break;
			case 4:
				System.out.println("*********************************");
				System.out.println("Account balance is 1000000");
				System.out.println("*********************************");

				break;

			default:
				System.out.println("Thanks for banking with us");

			}
		}

	}

}
