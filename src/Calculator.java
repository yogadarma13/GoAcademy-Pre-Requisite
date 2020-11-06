import java.util.Scanner;

class CalculatorOperation {
    private double result;

    public CalculatorOperation(double result) {
        this.result = result;
    }

    public void add(int number) {
        result += number;
    }

    public void subtract(int number) {
        result -= number;
    }

    public void multiply(int number) {
        result *= number;
    }

    public void divide(int number) {
        if (number == 0) {
            result = 0.0;
        } else {
            result /= number;
        }
    }

    public void restart() {
        result = 0.0;
    }

    public void print() {
        System.out.printf("%.1f%n", result);
    }
}

public class Calculator {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        CalculatorOperation calculatorOperation = new CalculatorOperation(0.0);
        boolean next = true;
        while (next) {
            String userInput = input.nextLine();

            String[] splitUserInput = userInput.split(" ");
            String commandInput = splitUserInput[0];

            if (commandInput.equalsIgnoreCase("exit")) {
                next = false;
            } else if (commandInput.equalsIgnoreCase("cancel")) {
                calculatorOperation.restart();
                calculatorOperation.print();
            } else {
                switch (commandInput) {
                    case "add":
                        calculatorOperation.add(Integer.parseInt(splitUserInput[1]));
                        break;
                    case "subtract":
                        calculatorOperation.subtract(Integer.parseInt(splitUserInput[1]));
                        break;
                    case "multiply":
                        calculatorOperation.multiply(Integer.parseInt(splitUserInput[1]));
                        break;
                    case "divide":
                        calculatorOperation.divide(Integer.parseInt(splitUserInput[1]));
                        break;

                }
                calculatorOperation.print();
            }

        }

    }
}
