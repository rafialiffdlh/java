public class Scope {
    public static void main(String[] args) {
        sayHello("rap");
    }

    public static void sayHello(String name) {
        if (!name.isBlank()) {
            String hi = "Hi" + " " +  name;
            System.out.println(hi);
        }
    }
}