public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("sakthi");
        dog.eat();
        dog.sleep();
        dog.bark();

        System.out.println();

        Cat cat = new Cat("chutti");
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}