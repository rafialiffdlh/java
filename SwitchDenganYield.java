public class SwitchDenganYield {
    public static void main(String[] args) {
        var nilai = "N";
        String ucapan = switch (nilai) {
            case "A":
                yield "Anda lulus dengan baik";
            case "B":
                yield "Anda lulus dengan baik";
            case "C":
                yield "Anda lulus";
            default:
                yield "Anda Tidak Lulus";
            // wajib ada default jika tidak ada default maka nilai akan merah

        };
        System.out.println(ucapan);
    }

}