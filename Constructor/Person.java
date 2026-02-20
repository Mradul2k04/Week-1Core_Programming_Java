public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    public static void main(String[] args) {
        Person original = new Person("Alice", 30);
        Person copy = new Person(original);

        System.out.println("Original: " + original.name + ", " + original.age);
        System.out.println("Copy: " + copy.name + ", " + copy.age);
    }
}
