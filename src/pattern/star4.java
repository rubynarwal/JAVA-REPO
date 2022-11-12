package pattern;

public class star4{
    public static void main(int N) {

        for (int p = 1; p <= N; p++) {
            for (int o = 1; o <= N; o++) {
                if (p == 1 || o == 1 || o == N) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
