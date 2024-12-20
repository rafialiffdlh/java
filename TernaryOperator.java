public class TernaryOperator {
    public static void main(String[] args) {
        // ini tanpa ternary operator
        var nilai = 60;
        String ucapan;

        if (nilai >= 80) {
            ucapan = "Nilai Kamu A";
        } else if (nilai >= 70) {
            ucapan = "Nilai Kamu B";
        } else if (nilai >= 60) {
            ucapan = "Nilai Kamu C";
        } else if (nilai >= 50) {
            ucapan = "Nilai Kamu D";
        } else {
            ucapan = "Nilai Kamu E";
        }
        System.out.println(ucapan);

        // ini dengan ternary operator
        var nilai2 = 90;
        String ucapan2 = (nilai2 >= 80) ? "Nilai Kamu A" : (nilai2 >= 70) ? "Nilai Kamu B" : (nilai2 >= 60) ? "Nilai Kamu C" : (nilai2 >= 50) ? "Nilai Kamu D" : "Nilai Kamu E";
        System.out.println(ucapan2);
    }
}
