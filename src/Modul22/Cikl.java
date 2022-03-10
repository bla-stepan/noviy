package Modul22;

public class Cikl {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i += 10) {
            if (i == 70) {
                continue;
            }
            System.out.println("Строка " + i);
        }

        //задание 2.8.1.
        int i = 10;
        do {
            i=--i;
            //System.out.println("Value i =" + i);
        } while (i>1);

        //задание 2.8.2.
        int sum = 10;
        for (int n = 10; n < 100; n = n + 10) {

            sum += n;
        }
        //System.out.println(sum);

        //задание 2.8.4.
        int a = 45;
        while ( a < 350){
            a++;
        }

        System.out.println("Value = " + a);
    }
}
