package OopsConcept;

public class EncapsulationArea {
    private int length;
    private int breadth;

    public void setArea(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    public int getArea(){
        return length * breadth;
    }

}

class Main{
    public static void main(String[] args) {
        EncapsulationArea obj = new EncapsulationArea();
        obj.setArea(5, 6);
        System.out.println(obj.getArea());
    }
}