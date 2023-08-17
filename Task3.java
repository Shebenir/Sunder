public class Task3 {

    public static class Cat implements Comparable<Cat> {
        private String name;
        private int age;
        private String ownerName;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // ... остальные методы класса Cat ...

        @Override
        public int compareTo(Cat otherCat) {
            return Integer.compare(this.age, otherCat.age);
        }

        // ... остальные методы класса Cat ...
    }

    // ... остальной код без изменений ...

    public static void main(String[] args) {
        Cat cat1 = new Cat("Саган", 15);
        Cat cat2 = new Cat("Нова", 10);

        int comparisonResult = cat1.compareTo(cat2);

        if (comparisonResult < 0) {
            System.out.println(cat1.getName() + " старше, чем " + cat2.getName());
        } else if (comparisonResult > 0) {
            System.out.println(cat2.getName() + " старше, чем " + cat1.getName());
        } else {
            System.out.println(cat1.getName() + " и " + cat2.getName() + " одного возраста");
        }
    }
}