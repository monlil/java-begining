package Lessonse44;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriteToFile { // Урок 44: Запись в файл.
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("TestFile");
        PrintWriter pw = new PrintWriter(file); // Предназначен только для текстовых значений

        pw.println("Test row 1");
        pw.println("Test row 2");
        pw.println("Настя заказала колонку FAIL");

        pw.close();
    }
}
