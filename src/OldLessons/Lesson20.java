package OldLessons;

public class Lesson20 {
    public static void main(String[] args) {
        Humans h1 = new Humans("kik",40);
        Humans h2 = new Humans("ll",15);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        Humans h3 = new Humans("Chok",19);
        h1.printNumberOfPeople();
        h2.printNumberOfPeople();
        h3.printNumberOfPeople();
    }
}
// при создании объекта всегда вызывается конструктор по уммолчанию. Если я переопределяю конструктор, то тот что был по умолчанию перестаёт существовать и начинает работать созданый.
// В классе мы можем использовать несколько методов с одним именем.До тех пор пока у них разные пораметры.
// Java понимает какой метод вызвать благодаря тем пораметрам которые мы передаём в момент вызова метода. Тоесть я написал разные условия в 3ёх конструкторах. При выполнении какого то из них будут выполняться действия калькулятора.
class Humans {
    private String name;
    private int age;
    private static int countPeople;

    public Humans(String name, int age){
        this.name = name;
        this.age = age;
        countPeople++;
    }

    private void setName(String name){
        this.name = name;
    }
    private void setAge(int age) {
        this.age = age;
    }
    public void printNumberOfPeople(){
        System.out.println("Namber of people is "+countPeople);
    }
}
