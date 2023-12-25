package OopsConcept.Abstraction;

import java.util.ArrayList;

public class EngineeringBranchApp {
    public static void main(String[] args) {
        StudentDetails(new ComputerScience());
        EngineeringBranch obj = new Electrical();

        // tightly coupled code
//        obj.secondYearSubjects();
//        Electrical e = new Electrical();
//        e.secondYearSubjects();
//        ComputerScience cs = new ComputerScience();
//        cs.secondYearSubjects();
//        Mechanical m = new Mechanical();
//        m.secondYearSubjects();


        // tightly coupled code
        //what is tightly coupled code?
        //Tightly coupled code is a kind of code where the classes and objects are highly dependent on one another.
        //If you make a change in one class, you need to make changes in all other classes too.
        //In such a case, it is better to have loosely coupled code.
        //Loosely coupled code is a kind of code where the classes and objects are independent of one another.

        // loosly couple
        //what is loosly coupled code?
        //Loosely coupled code is a kind of code where the classes and objects are independent of one another.
        //If you make a change in one class, you don't need to make changes in all other classes.
        //In such a case, it is better to have loosely coupled code.
        //Tightly coupled code is a kind of code where the classes and objects are highly dependent on one another.

        secondYear(new ComputerScience()); //here what is secondYear
        //secondYear is a method which is taking an object of EngineeringBranch as an argument
        //ComputerScience is a child class of EngineeringBranch
        secondYear(new Mechanical());
//        secondYear(new Mechanical());

    }
    public static void secondYear(EngineeringBranch eb){
        eb.secondYearSubjects();
    }

    public static void StudentDetails(EngineeringBranch obj) { // this method is called as upcasting
        obj.firstYearSubjects();
    }
}

//what is upcasting?
//Upcasting is the typecasting of a child object to a parent object.
//Upcasting is done implicitly.
//Upcasting is always safe because child class object has all the properties of parent class object.
//Upcasting is used to make the code more general.
// EnegineeringBranch obj = new ComputerScience(); // this is called as upcasting

//what is downcasting?
//Downcasting is the typecasting of a parent object to a child object.
//Downcasting is done explicitly.
//Downcasting is not safe because parent class object may not have all the properties of child class object.
//ComputerScience obj = (ComputerScience) new EnegineeringBranch(); // this is called as downcasting


//long a = 100000;
//int b = 10;
//b = a; // this is called as upcasting
//a = b; // this is called as downcasting
//downcasting is not safe because int b = 10; is not able to hold the value of long a = 100000;

//solid principles
//singul