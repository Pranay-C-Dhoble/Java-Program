package OopsConcept;

public class BankEncapsulation {
    int acc_no;
    String name;
    double amount;

    public int getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}

class MainBank{
    public static void main(String[] args) {
        BankEncapsulation obj = new BankEncapsulation();
        obj.setAcc_no(123456789);
        obj.setName("Rahul");
        obj.setAmount(1000000);
        System.out.println("Account Number: " + obj.getAcc_no() + " Name: " + obj.getName() + " Amount: " + obj.getAmount());
    }
}