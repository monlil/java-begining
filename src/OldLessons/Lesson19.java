package OldLessons;

public class Lesson19 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.setName("Kuk");
        human1.setAge(17);
        human1.getInfo();
        Human human2 = new Human();
        human2.setName("pup");
        human2.setAge(13);
        human2.getInfo();
    }
}
class Human{
    String name;
    int age;

    public void setName(String name){ //Чтобы внутри медода обратиться к перемонно класса. Мы не можем назва name = name. так система не поймёт что бы говырим . Но если мы хотим всётаки присвоить такое же имя как и тип . То обозначим тип приставкой this и имя атрибута класса получится this.name
        this.name = name;
    }
    public void setAge(int аge){ //тоже самое чо я и писал выше.Тот же пример.this Это ключевое слово вызывает обьект внутри класса.
        this.age = аge;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name+","+age);
    }
}
