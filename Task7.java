import java.util.Scanner;

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(newReal, newImaginary);
    }

    public ComplexNumber divide(ComplexNumber other) {
        double denominator = other.real * other.real + other.imaginary * other.imaginary;
        double newReal = (this.real * other.real + this.imaginary * other.imaginary) / denominator;
        double newImaginary = (this.imaginary * other.real - this.real * other.imaginary) / denominator;
        return new ComplexNumber(newReal, newImaginary);
    }

    @Override
    public String toString() {
        return real + (imaginary < 0 ? " - " : " + ") + Math.abs(imaginary) + "i";
    }
}

class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    public ComplexNumber readComplexNumber() {
        System.out.print("Enter real part: ");
        double real = scanner.nextDouble();
        System.out.print("Enter imaginary part: ");
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    public void showResult(ComplexNumber result) {
        System.out.println("Result: " + result);
    }

    public void close() {
        scanner.close();
    }
}

class CalculatorPresenter {
    private CalculatorView view;

    public CalculatorPresenter(CalculatorView view) {
        this.view = view;
    }

    public void runCalculator() {
        ComplexNumber num1 = view.readComplexNumber();
        ComplexNumber num2 = view.readComplexNumber();

        ComplexNumber sum = num1.add(num2);
        ComplexNumber product = num1.multiply(num2);
        ComplexNumber quotient = num1.divide(num2);

        view.showResult(sum);
        view.showResult(product);
        view.showResult(quotient);
    }
}
    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(view);

        presenter.runCalculator();

        view.close();
    }
public class Task7 {

    public static void main(String[] args) {
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(view);

        presenter.runCalculator();

        view.close();
    }
}