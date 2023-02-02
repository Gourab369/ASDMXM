package calculatorApp;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MathUtils mf = new MathUtils();
		float num1, num2;
		int choice = -1;
		while (choice != 0) {
			System.out.println("Calculator App starting...");
			System.out.println("1-> Addition");
			System.out.println("2-> Substraction");
			System.out.println("3-> Division");
			System.out.println("4-> Multiplication");
			// System.out.println("5-> Modulus");
			// System.out.println("6-> Power");
			System.out.println("7-> Exit");
			System.out.println("Choose an operation to perform: ");
			choice = sc.nextInt();

			switch (choice) {
				case 1:
					System.out.print("Enter Num 1: ");
					num1 = sc.nextFloat();
					System.out.print("Enter Num 2: ");
					num2 = sc.nextFloat();
					System.out.println("Result: " + mf.sum(num1, num2));
					break;
				case 2:
					System.out.print("Enter Num 1: ");
					num1 = sc.nextFloat();
					System.out.print("Enter Num 2: ");
					num2 = sc.nextFloat();
					System.out.println("Result: " + mf.substract(num1, num2));
					break;
				case 3:
					System.out.print("Enter Num 1: ");
					num1 = sc.nextFloat();
					System.out.print("Enter Num 2: ");
					num2 = sc.nextFloat();
					System.out.println("Result: " + mf.divide(num1, num2));
					break;
				case 4:
					System.out.print("Enter Num 1: ");
					num1 = sc.nextFloat();
					System.out.print("Enter Num 2: ");
					num2 = sc.nextFloat();
					System.out.println("Result: " + mf.multiply(num1, num2));
					break;
				case 5:
					System.out.print("Enter Num 1: ");
					num1 = sc.nextFloat();
					System.out.print("Enter Num 2: ");
					num2 = sc.nextFloat();
					System.out.println("Result: " + mf.modulus(num1, num2));
					break;
				case 6:
					System.out.print("Enter Num 1: ");
					num1 = sc.nextFloat();
					System.out.print("Enter Num 2: ");
					num2 = sc.nextFloat();
					System.out.println("Result: " + mf.power(num1, num2));
					break;
				case 7:
					choice = 0;
					System.out.println("Bye!!");
					break;
				default:
					System.out.println("Invalid Input");
			}
		}
	}

}
