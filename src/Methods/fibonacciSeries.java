package methods;

public class fibonacciSeries {
    public static void main(String[] args) {
        int result = fibonacci(6);
        System.out.println(result);
    }
    static int fibonacci(int n){
        if(n == 1 || n == 2){
            return n - 1;
        }
        else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
        // fibonacci series 0 1 1 2 3 5
        //5-1 = 4 + 5-2 = 3
        //4-1 = 3 + 4-2 = 2
        //3-1 = 2 + 3-2 = 1
        //2-1 = 1 + 2-2 = 0
    }
}
