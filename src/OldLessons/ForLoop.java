package OldLessons;

public class ForLoop { // как работает цикл For. Сначало у нас инициализируется переменная. Затем заходим в цикл
    public static void main(String[] args) {
        for(int i = 10; i>=3; i = i-1) { // Hello будет аллертить до тез пор пока i не станет больше 10 i>10. Либо, я сделал второй раз на убивание .Б  удет алертить до тех пор пока не станет i>=3
            System.out.println("Hello "+i); // i++ идентичен и равен *==* выражению i = i+1    i++ == i = i+1 (True)
        }
    }
}
