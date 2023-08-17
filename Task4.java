public class Task4 {

    public static <T> void printElement(T element) {
        System.out.println(element);
    }

    public static void main(String[] args) {
        Integer integer = 42;
        String string = "Hello, world!";
        Double floatingPoint = 3.14;

        printElement(integer);       // Выводится: 42
        printElement(string);        // Выводится: Hello, world!
        printElement(floatingPoint); // Выводится: 3.14
    }
}