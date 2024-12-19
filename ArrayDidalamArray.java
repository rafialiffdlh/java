public class ArrayDidalamArray {
    public static void main (String[] args) {
        String [] [] members = {
            {"rafi", "alif", "fadhilah"},
            {"tapusz", "menon"},
            {"alip", "rapi", "pp"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);

        System.out.println(members[1][1]);
        System.out.println(members[2][2]);
    }
}
