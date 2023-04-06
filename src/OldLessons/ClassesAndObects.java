package OldLessons;

public class ClassesAndObects {  // Классы могут быть:
                                 // 1. Данные (поля) Пример: Возраст, вес, цвет глаз, фамилия.
                                 // 2. Действия, которые он может совершать(методы) Пример: говорить, бегать
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Жёлудь";
        person1.age = 17;
        int years1 = person1.calculateYearsToRetirement();
        Person person2 = new Person();
        person2.name= "Григорий Лепс";
        person2.age= 55;
        int years2 = person2.calculateYearsToRetirement();
        System.out.println("Первому до старости "+years1+" лет");
        System.out.println("Второму до старости "+years2+" лет");

    }
}
class Person{
    String name;
    int age;

    int calculateYearsToRetirement(){ //Если указан конкретный типо возвращаемого значение, то не получится вернуть друой тип. могу вернуть int но не String
        int years = 65-age;
        return years; // обычно return идёт последним в методе и завершает его

    }

    void speak(){
        for(int i = 0; i<3; i++){
        System.out.println("Меня зовут "+name+",мне "+age+" лет");}
    }
    void sayHello(){
        System.out.println("Привет!");
    }
}
