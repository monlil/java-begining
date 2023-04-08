package Lessons30;

public class Test {
    public static void main(String[] args) {

        double d = 123.6;
        int i = (int) d;
        Long l = Math.round(d);

        System.out.println(i);
        System.out.println(l);



        int a = 132;

        long L = a; //неявное.Потому что Java это делает за нас.
        int x = (int) L; // явное(приходится указывать) приведение типов.Long больше инта в 2 раза inta.
        // Поэтому с inta в Long Java уверен что можно, а втот наобороорт сомневается.Так как может не поместиться.
        System.out.println(x);

    }
}
