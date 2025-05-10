interface Vehicle {
    void start ();
}

interface Vehicle2 {
    void stop();
}

class Bike implements Vehicle,Vehicle2 {
    public void start ()
    {
       System.out.println("Bike starts"); 
    }
    public void stop ()
    {
        System.out.println("bike stopped");
    } 
}

class car implements Vehicle,Vehicle2 {
    public void start ()
    {
        System.out.println("car starts");
    }
    public void stop ()
    {
        System.out.println("car stopped");
    }
}

class truck implements Vehicle,Vehicle2 {
    public void start ()
    {
        System.out.println("truck Starts");
    }
    public void stop ()
    {
        System.out.println("truck stopped");
    }
}

public class ReallifeInterface {
    public static void main(String[] args) {
        Vehicle obj1 = new Bike();
        Vehicle obj2 = new car();
        Vehicle obj3 = new truck();

        obj1.start();
        obj2.start();
        obj3.start();

        Vehicle2 obj4 = new Bike();
        Vehicle2 obj5 = new car();
        Vehicle2 obj6 = new truck();

        obj4.stop();
        obj5.stop();
        obj6.stop();
    }
}
