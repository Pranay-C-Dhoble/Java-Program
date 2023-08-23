package Methods;
//Define VarArgs
//VarArgs is a feature of Java that supports the passing of an arbitrary number of parameters of the same type to a method.


//Difference Between Arguments and Parameters
//Parameters are the variables used in the method declaration whereas arguments are the values passed to the method while calling.
public class VariableArgumentsVarArgs {
    public static void main(String[] args) {
        System.out.println("VarArgs Program");
        System.out.println(sum(1,2,3));//varArgs is a array
        System.out.println(sum(1,2,3,4));//---->this is Arguments
        System.out.println(sum(1,2,3,4,5));
        System.out.println(sum(1,2,3,4,5,6));
    }
    static int sum(int ...arr){ //varArgs  //---->this is Parameters
        int result = 0;
        for(int a : arr){
            result += a;
        }
        return result;
    }
}
