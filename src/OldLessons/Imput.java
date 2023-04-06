package OldLessons;

import java.util.Scanner;

public class Imput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // У обьекта класса сканер вызвали метод который считает с клавиатуры одну строчку чего то.Строчка продолжается до тех пор пока не нажмём на Inter
        System.out.println("Введите Какое-нибудь число!");
        int x = s.nextInt();
        System.out.println("Вы ввели "+x);
    }
}
