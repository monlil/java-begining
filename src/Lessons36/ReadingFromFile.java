package Lessons36;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFromFile {  // Урок 36: Чтение из файла.
    public static void main(String[] args) throws FileNotFoundException {
        String separator = File.separator; //+separator сам определяет какая у нас система и какой именно раз=
        // делитель нужен. В Mac и Linux идёт такой слэшь / в Windows такой \\ м вот чтобы самис не гадать
        // используется separator
        String path = separator+ "C:" +separator+ "Users" +separator+ "admin7" +separator+ "Desktop" +separator+ "Test.txt";
        File file = new File(path);
        // уогда у Windows указываем путь, так же нужно указать у конечного файла формат вот "Test.txt" иначе путь
        // теряется и Java не находит файл

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }
        scanner.close();
        // Обязательно вконце программы нужно закрывать сканер вызывая метод .close()
        // Чтобы освободить ресурсы и паток не оставался открытым.
    }
}
