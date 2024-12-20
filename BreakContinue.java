public class BreakContinue {
    public static void main(String[] args) {

        // ini break
        var counter = 1;
        while (true) {
            System.out.println("Perulangan ke-" + counter);
            counter++;

            if (counter > 12) {
                break;
            };
        }


        // ini continue
        for(int counter2 = 1; counter2 <=100; counter2++){
            if (counter2 % 2 == 0){
                continue ;
            }
        
            System.out.println("Perulangan Ganjil-" + counter2);
        }
    }
    
}
