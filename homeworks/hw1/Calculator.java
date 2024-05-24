public class Calculator{
	public double add(double a, double b){
		return a + b;
	}

	public double subtract(double a, double b){
		return a - b;
	}

	public double multiply(double a, double b){
		return a * b;
	}

	public double divide(double a, double b){
		return a / b;
	}

	public void calculate(char operator, double a, double b){
		double result;
		switch(operator){
		case '+' :
			result = add(a, b);
			break;
		case '-' :
			result = subtract(a, b);
			break;
		case '*' :
			result = multiply(a, b);
			break;
		case '/' :
			if(b == 0) {
				System.out.println("invalid input, the divisor cannot be zero");
				return;
			}
			else{
				result = divide(a, b);
				break;
			}
		default:
			System.out.println("invalid input, please try again (you can input +-*/)");
			return;
		}
		System.out.printf("result: %.2f\n", result);
	}
}