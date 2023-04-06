package OldLessons;

public class Arrays {
    public static void main(String[] args) {
        int number = 10; // Примитивный тип данных       // [10]
        int [] numbers = new int[10];//Ссылочеый тип       //number ->[массив
        for (int i = 0; i<numbers.length; i++) {//Цикл for подходит для инициализации массива
            numbers[i] = i*12;
        }
        for (int i = 0; i<numbers.length;i++) {
            System.out.println(numbers[i]);
        }
        System.out.println();
        int[] numbers1 = {1,2,3,4};
        for(int i = 0; i<numbers1.length;i++){
            System.out.println(numbers1[i]);
        }
    }
}
