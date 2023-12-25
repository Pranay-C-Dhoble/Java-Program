package composition.Door;

public class Door {
    //Dore Properties
    private String color; //here why we are using private?
    //because we don't want to expose the color property to the outside world.
    //we want to control the access to the color property.
    //we want to make sure that the color property is set only once.
    //we want to make sure that the color property is set only to a valid value.


    //How we can access the color property from outside the class?
    //we can use a method called getColor() to access the color property.
    //we can use a method called setColor() to set the color property.
    private int height;
    private int width;
    private Lock lock;
    private Latch latch;

    //I want to make sure that the color property is set only once.
    //how to do that?
}
