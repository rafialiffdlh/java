public class RecursiveMethod {

    // factorial loop
    public static int factorial(int value) {
        var result = 1;
        for (int i = 1; i <= value; i++) {
            result *= i;
        }
        return result;
    }

    // kode factorial Recursive
    public static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }



    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorialRecursive(5));
    }


    // error stackOverflow
    static void loop(int value) {
        if ( value == 0 ){
            System.out.println("selesai");
        } else {
            System.out.println("Loop" +value);
            loop(value - 1);
        }
        
    }
}