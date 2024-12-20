public class MethodOverloading {
    public static void main(String[] args) {
        sayHello2();
    }
    
   public static String firstName = "rapi";

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void sayHello2() {
        System.out.println("hello" + firstName);
    }

    public static void sayHello3(String firstName, String lastName) {
        System.out.println("hello" + firstName + " " + lastName);
}
}