package OldLessons;

public class Arrays_of_Strings {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Привет! Привет=)";
        strings[1] = "пока-пока 0/";
        strings[2] = "Ка-ка";

        for (int i =0; i<strings.length; i++){
            System.out.println(i);
        }
        System.out.println();

        for(String string:strings){ // тип данных-переменная-массив через который мы хотим проходить
            System.out.println(string);
        }
        int [] numbers1 = {1,2,3};
        int sun = 0;
        for (int x:numbers1){
            sun = sun+x;
        }
        System.out.println();
        System.out.println(sun);

        int value = 0;
        String s = "sds";
        System.out.println(s);
    }
}
