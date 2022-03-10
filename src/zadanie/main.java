package zadanie;

public class main {
    public static void main(String[] args) {
        Car newCar = new Car();//Создайте в классе main новый объект newCar.
        newCar.build();//Вызовите метод build
        newCar.buy();//Вызываем метод buy
        noReturn();
        //sum();// результат поччитается но не выведется на консоль
        System.out.println(sum(11, 4, "name"));// результат  метода sum выведется на консоль
        //bay();
        metodNoviy();
    }

    private static void metodNoviy() {
        System.out.println("Лайф Хак как переводить код в методы");
    }

    public static void noReturn() {
        System.out.println("No Return");
    }

    public static int sum(int a, int b, String name) {
        return a + b + 8;
    }
    //public static void bay(){
    // System.out.println("I will buy this car");
    //}
}
