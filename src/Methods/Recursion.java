package methods;

//Recursion
//Recursion is the process of repeating items in a self-similar way.
//In programming languages, if a program allows you to call a function inside the same function, then it is called a recursive call of the function.

public class Recursion {
    public static void main(String[] args) {
        //factorial of 0 = 1
        //factorial of 1 = 1
        //factorial of 5 = 5*4*3*2*1 = 120
        //factorial of 4 = 4*3*2*1 = 24
        //factorial of n = n*(n-1)*(n-2)*(n-3)....1
        int a = factorial(5);
        System.out.println("The factorial of 5 is : "+a);
    }
    static int factorial(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
}
// fibonacci series Eg: 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

//System.out.format("The value of pi is %.4f", Math.PI); //---->this is for print pi value
//output: The value of pi is 3.1416