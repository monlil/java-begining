package OldLessons;

import java.util.Scanner;

public class DoWhile {  // Пишем программу которая будет считывать цифры с клавы до тех пор пока не прочитает 5
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Создаём переменную класса Сканер и ссылаем её на обьект класса сканер.
        int value;
        do{
            System.out.println("Введи 5"); // Входим.Просят ввести любое число. Если оно равно 5 то цикл завершается.
            value = scanner.nextInt();
        } while(value!=5);
        System.out.println("Вы ввели 5");
    }
}
