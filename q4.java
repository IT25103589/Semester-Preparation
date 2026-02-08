public class q4 {
    public static void main(String[] args) {
        System.out.println("IT25013589");
        
        System.out.println("Using while loop");
        int r = 0;
        while (r < 5) {
            int c = 0;
            while (c < 5) {
                System.out.print("* ");
                c++;
            }
            System.out.println();
            r++;
        }

        System.out.println("Using for loop");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}