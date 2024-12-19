public class KonversiDariTipePrimitif {
    public static void main(String[] args) {
        int age = 18;
        Integer ageObject = age;

        int ageAgain = ageObject;

        short shortAge = ageObject.shortValue();
        short byteAge = ageObject.byteValue();

        System.out.println(shortAge);
        System.out.print(ageAgain);
        System.out.println(" " + byteAge);
    }
}
