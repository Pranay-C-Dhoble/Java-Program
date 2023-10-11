package OopsConcept.Inheritance.SuperKeyWord;

public class ShoppingDiscount extends Discount{
    int Discount ;
    int Amount ;
    ShoppingDiscount(){
        super();
        System.out.println("ShoppingDiscount class constructor");
    }
    ShoppingDiscount(int a){
        super(a);
        System.out.println("ShoppingDiscount class parameterized constructor");
    }
    public double getDiscountPrice(){
        return super.getDiscountPrice();
    }
}
