public class Task2 {
    public static class Rectangle {
        private double width;
        private double height;

        // Конструктор без параметров
        public Rectangle() {
            this.width = 1.0;
            this.height = 1.0;
        }

        // Конструктор с параметрами
        public Rectangle(double width, double height) {
            this.width = width;
            this.height = height;
        }

        // Геттеры и сеттеры для ширины и высоты
        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            this.width = width;
        }

        public double getHeight() {
            return height;
        }

        public void setHeight(double height) {
            this.height = height;
        }

        // Метод для вычисления площади прямоугольника
        public double calculateArea() {
            return width * height;
        }

        // Метод для вычисления периметра прямоугольника
        public double calculatePerimeter() {
            return 2 * (width + height);
        }
    }

    public static void main(String[] args) {
        // Создание прямоугольника с шириной 5.0 и высотой 3.0
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);

        // Вывод свойств прямоугольника
        System.out.println("Ширина прямоугольника: " + rectangle1.getWidth());
        System.out.println("Высота прямоугольника: " + rectangle1.getHeight());

        // Вычисление площади и периметра
        System.out.println("Площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Периметр прямоугольника: " + rectangle1.calculatePerimeter());

        // Изменение свойств прямоугольника
        rectangle1.setWidth(7.0);
        rectangle1.setHeight(4.0);

        // Вычисление площади и периметра после изменения
        System.out.println("Новая площадь прямоугольника: " + rectangle1.calculateArea());
        System.out.println("Новый периметр прямоугольника: " + rectangle1.calculatePerimeter());
    }
}