public class SwitchTanpaYield {
    public static void main(String[] args) {
        var nilai  = "z";
        String ucapan;

        switch (nilai) {
            case "A" -> ucapan = "Anda lulus dengan sangat baik";
            case "B" -> ucapan = "Anda lulus dengan baik";
            case "C" -> ucapan = "Anda lulus";
            case "D" -> ucapan = "Anda Tidak Lulus";
            default -> ucapan = "Silahkan Coba Lagi";

        }
        System.out.println(ucapan);
    }
}
