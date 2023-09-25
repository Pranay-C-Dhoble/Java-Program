package OopsConcept.Inheritance.SuperKeyWord;

public class FoodDiscount extends Discount{
    int Discount ;
    int Amount ;
    public FoodDiscount(){
        super();
        System.out.println("FoodDiscount class constructor");
    }
    public FoodDiscount(int b){
        super(b);
        System.out.println("FoodDiscount class parameterized constructor");
    }
    public double getDiscountPrice(){
        return super.getDiscountPrice();
    }
}
