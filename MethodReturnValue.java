public class MethodReturnValue {
    public static void main(String[] args) {
        var a = 10;
        var b = 20;
        var c = 30;

        System.out.println(c);
    }

    // jika mau pakai static harus di tutup dengan kurawal terlebih dahulu jika tidak di tutup maka akan valuenya akan kosong
    static int sum(int value1, int value2){
    var total = value1 + value2;

    return total;
        }
}
