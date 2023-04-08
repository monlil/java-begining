package Lessons31;

public class Test {
    public static void main(String[] args) {
        int x = 123;
        Integer x2 = new Integer(123);
        Integer x3= 123; //это автоупаковка.Делает тоже,что и Integer x2 = new Integer(123);
        int y = x3; //Это авто распоковка с Integer в int
        System.out.println(y);

        // обертки примитивных типов данных. Double, Float, Long, Integer, Short, Byte ,Character, Boolean
        // Если нужен просто приметив(Число), то используется  приметив ,так как занимает меньше места и инициализыция чище.
        // Если нужен метод то используются обертки примитивных типов данных
    }
}
