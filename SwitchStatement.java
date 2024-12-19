public class SwitchStatement {
    public static void main(String[] args) {

        var nilai = "b";

        switch (nilai) {
          case "A":
            System.out.println("Wow, Anda Lulus Dengan Baik");
            break;
          case "B":
          case "C":
            System.out.println("Nilai Anda Cukup Baik");
            break;
          case "D":
            System.out.println("Anda tidak lulus");
            break;
          default:
            System.out.println("Mungkin Anda salah jurusan");
        }
    }
    
}
