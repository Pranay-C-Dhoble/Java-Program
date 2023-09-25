package OopsConcept.Inheritance;

public class vehicleApp {
    public static void main(String[] args) {
        car c = new car();
        c.start();
        c.stop();
        c.refuel();
        c.theftSafety();
        System.out.println("******************");
        bike b = new bike();
        b.start();
        b.stop();
        b.refuel();
        b.theftSafety();
        System.out.println("******************");
        bus bu = new bus();
        bu.start();
        bu.stop();
        bu.refuel();
        bu.theftSafety();
        System.out.println("******************");
        truck t = new truck();
        t.start();
        t.stop();
        t.refuel();
        t.theftSafety();

        c.color = "Red";
        c.wheels = 4;
        c.speed = 200;
        c.name = "BMW";
        c.model = "X5";
        System.out.println("******************");

        c.test();
    }
}
