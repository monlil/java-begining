package OldLessons;

public class ClassesAndObects17Lesens {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.setNameAndAge("Жёлудь",17);
        String pipi = "Вокунга";
        Person1 person2 = new Person1();
        person2.setNameAndAge(pipi,55);
        person1.speak();
        person2.speak();


    }
}
class Person1{
    String name;
    int age;

    void setNameAndAge(String userName, int userage){
        name = userName;
        age = userage;
    }

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

