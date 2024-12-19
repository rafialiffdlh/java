public class IfElseStatement {
    public static void main(String[] args) {
        var nilai = 60;
        var absen= 50;

        if (nilai >= 80 && absen >= 80) {
            System.out.println("Nilai Kamu A");
        }
        else if (nilai >= 70 && absen >= 70) {
            System.out.println("Nilai Kamu B");
        }
        else if (nilai >= 60 && absen >= 60) {
            System.out.println("Nilai Kamu C");
        }
        else if (nilai >= 50 && absen >= 50) {
            System.out.println("Nilai Kamu D");
        }
        else {
            System.out.println("Nilai Kamu E");
        }
    }
}
