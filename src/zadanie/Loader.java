package zadanie;

public class Loader {

    public static void main(String[] args) {
        int value = add(3, 4);
        int result = add(value, 10);
        System.out.println(result);
        String str = "String #1";
        String Str = "String #2";
        String sTr = "String #3";
        String StR = "String #4";
        str = sTr;
        System.out.println(str);
    }

    public static int add(int x, int y) {
        int result = x + y;
        return result;
    }
}
