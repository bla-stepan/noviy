package Modul22;

public class Loader {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));

        //Задание 2.7.2.
        int variable = 7;
        variable = variable > 10 ? variable - 10 : variable + 10;
        //System.out.println(variable);

        int stepan = 5 > 10 ? 10 : 11;
        //System.out.println(stepan);

    }
        //задание 2.7.1.
    public static String decode(char ch) {
        switch (ch) {
            case 'h':
                return "Hello!";
            case 'i':
            case 'm':
            case 'k':
                return "I can decode!";
            case 'b':
                return "Bye!";
            default:
                return "I don't know these symbols :(";
        }
    }
}

