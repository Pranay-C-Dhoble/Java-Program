package OopsConcept.Inheritance.SuperKeyWord;
//Parent class Discount, Child class ShoppingDiscount of Discount, Child Class FoodDiscount of Discount with amount and discount as properties and getDiscountPrice() is a method with default constructor and 1 paramterized constructor
public class Discount {
    int Discount;
    int Amount;
    public Discount(){
        System.out.println("Default Constructor");
    }
    public Discount(int a){
        Amount = a;
        System.out.print("Parameterized Constructor :");
        System.out.println(a);
    }
    public double getDiscountPrice(){
        System.out.print("Discount Price");
        return Amount - (Amount * (Discount / 100));
    }
}
