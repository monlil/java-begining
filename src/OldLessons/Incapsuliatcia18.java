package OldLessons;

public class Incapsuliatcia18 {
    public static void main(String[] args){

        Person2 person1 = new Person2();
        person1.setName("Какое то имя");
        person1.setAge(7);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person1.speak(); //api это тот интерфейс через который пользователь получает доступ к функционалу программы.
    }
}
class Person2{
    private String name; //Если ставить private перед полем в классе, то это поле теперь доступно только в этом классе. Это для того чтобы не дать пользователю доступ к name и age/
    // В данном случае в пределах класса Person2. Зачем это?
    // теперь мы можем менять внутри класса Person2 name на что угодно и пользователь не заметит этого изминения.Потому что эти изминения именно в в классе одном
    private int age;

    public void setName(String userName){
        if (userName.isEmpty()){ // проверяет чтобы пользователь не оставлял пустую строку
            System.out.println("Ты ввёл пустое имя");
        } else{
        name = userName;}
    }
    public String getName(){
        return name;
    }
    public  void  setAge(int userAge){
        age = userAge;
    }
    public int getAge(){
        return age;
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
