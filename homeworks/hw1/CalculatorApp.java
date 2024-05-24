import java.util.Scanner;

public class CalculatorApp{
	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		Calculator calculator = new Calculator();

		//a, b, operator
		double a;
		double b;
		char operator;
		//string for get char
		String s;

		while(true){
			//get the input number
			System.out.print("please input the fisrt number(type of double):");
			a = reader.nextDouble();
			System.out.print("please input the second number(type of double):");
			b = reader.nextDouble();
			//get the CR
			s = reader.nextLine();
			System.out.print("please input the operator(+,-,*,/):");
			//get the operator
			s = reader.nextLine();
			operator = s.toCharArray()[0];

			calculator.calculate(operator, a, b);

			System.out.println();
			System.out.print("input 'continue' to continue, else input 'finish' to exit:");
			String input = reader.next();
            if ("finish".equalsIgnoreCase(input)) {
                break;
            }
		}
		reader.close();
	}
	
}