import java.util.Scanner;

// Model
class CalculatorModel {

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double subtract(double num1, double num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        return num1 * num2;
    }

    public double divide(double num1, double num2) {
        if (num2 == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return num1 / num2;
    }
}

// View
class CalculatorView {

    public String getOperation() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter operation (+, -, *, /): ");
        return scanner.nextLine();
    }

    public double getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }

    public void showResult(double result) {
        System.out.println("Result: " + result);
    }
}

// Presenter
class CalculatorPresenter {

    private CalculatorModel model;
    private CalculatorView view;

    public CalculatorPresenter(CalculatorModel model, CalculatorView view) {
        this.model = model;
        this.view = view;
    }

    public void performCalculation() {
        String operation = view.getOperation();
        double num1 = view.getNumber();
        double num2 = view.getNumber();

        double result;
        switch (operation) {
            case "+":
                result = model.add(num1, num2);
                break;
            case "-":
                result = model.subtract(num1, num2);
                break;
            case "*":
                result = model.multiply(num1, num2);
                break;
            case "/":
                result = model.divide(num1, num2);
                break;
            default:
                System.out.println("Invalid operation.");
                return;
        }

        view.showResult(result);
    }
}

// Main Application
public class CalculatorApp {

    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        System.out.println("Calculator MVP - Enter 'exit' to quit");
        while (true) {
            presenter.performCalculation();
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            Scanner scanner = new Scanner(System.in);
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("no")) {
                break;
            }
        }
    }
}