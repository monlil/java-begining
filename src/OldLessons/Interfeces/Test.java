package OldLessons.Interfeces;

public class Test {
    public static void main(String[] args) {
        Animal animal1 = new Animal(1);
        Person person1 = new Person("Chop");
        animal1.sleep();
        person1.sayHello();
    }
}
