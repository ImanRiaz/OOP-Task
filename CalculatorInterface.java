// Operations interface
interface Operations {
    double add(double a, double b);
    double subtract(double a, double b);
    double multiply(double a, double b);
    double divide(double a, double b) throws ArithmeticException;
}

// Calculator class implementing Operations interface
class Calculator implements Operations {

    // Implementing add() method
    public double add(double a, double b) {
        return a + b;
    }

    // Implementing subtract() method
    public double subtract(double a, double b) {
        return a - b;
    }

    // Implementing multiply() method
    public double multiply(double a, double b) {
        return a * b;
    }

    // Implementing divide() method
    public double divide(double a, double b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

public class CalculatorInterface {
    public static void main(String[] args) {
        // Predefined numbers
        double num1 = 10;
        double num2 = 5;

        // Creating Calculator object
        Calculator calc = new Calculator();

        // Performing and displaying the results of all operations
        System.out.println("Addition: " + calc.add(num1, num2));
        System.out.println("Subtraction: " + calc.subtract(num1, num2));
        System.out.println("Multiplication: " + calc.multiply(num1, num2));
        try {
            System.out.println("Division: " + calc.divide(num1, num2));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
