package OldLessons.Calculator;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        //2+3=5
        //x+v=xv
        Converter converter = new Converter();
        String[] actions = {"+", "-", "/", "*"};
        String[] regexActions = {"\\+", "-", "/", "\\*"};
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите выражение: ");
        String exp = scn.nextLine();
        //Определяем орифметическое действие
        int actionIndex=-1;
        for (int i = 0; i < actions.length; i++) {
            if (exp.contains(actions[i])){
                actionIndex = i;
                break;
            }
        }
        //Если не нашли арифметического действия, завершаем программу
        if (actionIndex==-1){
            System.out.println("Некорректные выражения");
            return;
        }
        //Делим строку по найденному арифметическому знаку


        String[] data = exp.split(regexActions[actionIndex]);
        //Определяем, находятся ли числа в одном формате (оба римские или оба фрабские)
        if(converter.isRoman(data[0]) == converter.isRoman(data[1])){
            int a,b;
            //Определяем римские ли числа
            boolean isRoman = converter.isRoman(data[0]);
            if(isRoman){
                //Если римские, то конвертируем в арабские
                //X+V
                //X-10
                //V - 5
                a = converter.romanToInt(data[0]);
                b = converter.romanToInt(data[1]);

            } else {
                //если арабские, конвертируем их из строки в число
                a = Integer.parseInt(data[0]);
                b = Integer.parseInt(data[1]);
            }
            //выполняем с чилами арифметическое значение
            int result;
            switch (actions[actionIndex]){
                case "+":
                    result = a+b;
                    break;
                case "-":
                    result = a-b;
                    break;
                case "*":
                    result = a*b;
                    break;
                default:
                    result = a/b;
                    break;
            }
            //15->XV
            if (isRoman){
                //если числа были римские то возврашаем результат в римском числе
                System.out.println(converter.intToRoman(result));
            }
            else {
                //если числа были арабские то возвроащаем результат в арабском числе
                System.out.println(result);
            }
        }else{
            System.out.println("Числа должны быть в одном формате");
        }


    }
}
