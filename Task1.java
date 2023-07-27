public class Task1 {

    public static class Cat {
        private String name;
        private int age;
        private String ownerName;

        public Cat(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void greet() {
            if (ownerName != null) {
                System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет). Мой владелец - " + ownerName + ".");
            } else {
                System.out.println("Мяу! Меня зовут " + name + ". Мне " + age + " года(лет).");
            }
        }
    }

    public static class Owner {
        private String name;

        public Owner(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Саган", 15); // Создаем объекты кота и его владельца

        Owner owner = new Owner("Мирана");
        
        cat.setOwnerName(owner.getName());  // Связываем кота с его владельцем
        
        cat.greet();    // Выводим приветствие кота на консоль
    }
}