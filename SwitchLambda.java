public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "Z";

        switch(nilai) {
            case "A" -> System.out.println("Anda lulu dengan sangat baik");
            case "B" -> System.out.println("Anda lulus dengan baik");
            case "C" -> System.out.println("Anda lulus ");
            case "D" -> System.out.println("Anda tidak lulus");
            default -> System.out.println("Anda salah jurusan");
        }
    }
}
