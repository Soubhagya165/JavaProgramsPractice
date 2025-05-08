abstract class Main {
    abstract void display1();
    void display2 () {
        System.out.println("My name is Soubhagya kumar mishra");
    }
    void display3 () {
        System.out.println("I am 21 years old");
    }
}

class newMain extends Abstractclass {
    void display1() {
        System.out.println("This is my second Implementation");
    }

    void display4 ()
    {
        System.out.println("Another Method");
    }
}

public class Abstractclass extends Main {
    void display1 () {
        System.out.println("This is implementing abstract classes");
    }
    public static void main(String[] args) {
        Abstractclass obj = new Abstractclass();
        newMain obj2 = new newMain();
        obj.display1();
        obj2.display1();
        obj2.display2();
        obj2.display3();
        obj2.display4();
    }
}
