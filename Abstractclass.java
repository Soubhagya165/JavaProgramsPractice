abstract class Main {
    abstract void display1();
    void display2 () {
        System.out.println("My name is Soubhagya kumar mishra");
    }
    void display3 () {
        System.out.println("I am 21 years old");
    }
}

public class Abstractclass extends Main {
    void display1 () {
        System.out.println("This is implementing abstract classes");
    }
    public static void main(String[] args) {
        Abstractclass obj = new Abstractclass();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}
