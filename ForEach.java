public class ForEach {
    public static void main(String[] args) {

        // ini dengan for each
        // String[] array = {
        //     "rafi", "alif",
        //     "18", "tahun",
        // };
        // for (var value : array ){
        //     System.out.println(value);
        // }

        // ini tanpa for each
        String[] array2 = {
            "rafi", "alif",
            "18", "tahun",
        };
        for (int i = 0; i < array2.length; i++){
            System.out.println(array2[i]);
        }
    }
}
