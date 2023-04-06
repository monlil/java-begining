package OldLessons;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scaner = new Scanner(System.in);
        System.out.println("Введи возраст");
        int age = scaner.nextInt();
        switch(age){ // Сюда мы помещаем переменную которая может принимать различные значения.
            case 0 : // если равно0 то ты родился.
                System.out.println("Ты родился!"); // Тут мы начали переберать все значения.
                break; // завершаем программу и т.д
            case 7 :
                System.out.println("Ты пошёл в шкилу!");
                break;
            case 18 :
                System.out.println("Ты закончил шкилу и теперь ты долбаёб");
                break;
            default:
                System.out.println("Ты шлюха");
        }
    }
}
