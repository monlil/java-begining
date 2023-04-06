package OldLessons;

public class WhileLoops {
    public static void main(String[] args) {
        int value = 0;
       while (value<5){ // Так работакт цикл whileю Он работает до тех пор пока условие в круглых скобках не даст значение True.
           System.out.println("Hello "+value);
           value = value+1; // После каждого value добавляем 1. Это позволяет в определённый момент остановить программу и при изминении значения снова продолжать.Для мониторинга и аллерта подходит
       }
    }
}
