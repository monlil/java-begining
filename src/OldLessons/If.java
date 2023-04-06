package OldLessons;

public class If {
    public static void main(String[] args){ // Позволяет задать условие Если.Если не так то так. И задать значение для каждого если.
        int myInt = 15;
        if(myInt<10){  // Условие проверяется с верху вниз. Тоесть первое условие для проверки myInt<10
            System.out.println("Да. верно.");
        } else if (myInt>20){
            System.out.println("Нет, не верно!");
        }else{
            System.out.println("ни один из предыдущих случаев.");
        }
        }
}
