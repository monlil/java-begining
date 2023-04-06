package OldLessons;

public class Strings {
    public static void main(String[] args) {
        int x = 5; // Все примитивные типы данных начинаются с маленькой буквы. Он хранит в себе как коробка значения
        String s = "Hello";// String  с заглавной потому что он является классом. Классы пишутся с большой буквы. Класс это указание к тому как нам создавать обьекты.
        // Тоесть Hello это обьект и переменная s ссылается на него.
        String spase = " ";
        String name = "Kuk";
        System.out.println(s+spase+name);
        System.out.println("Hello"+ " "+ "Pik");
        System.out.println("My number is "+ x);

        String srt = new String("java");
        String srt2 = "java";
        System.out.println (srt.compareTo(srt2));
    }
}
