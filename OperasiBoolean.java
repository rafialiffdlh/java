public class OperasiBoolean {
    public static void main(String[] args){
        boolean iniBoolean = true;
        boolean iniSalah = true;

        var absen = 90;
        var nilaiAkhir = 95;

        var LulusAbsen = absen >= 80;
        var LulusNilaiAkhir = nilaiAkhir >= 95;

        var lulus = LulusAbsen && LulusNilaiAkhir;
        System.out.println(lulus);
        System.out.println("Apakah Anda Lulus? " + lulus);

        System.out.println("iniBoolean: " + iniBoolean);
        System.out.print(iniSalah);
    }
}
