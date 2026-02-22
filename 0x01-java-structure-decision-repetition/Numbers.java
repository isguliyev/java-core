public class Numbers {
    public static void main(String[] args) {
        final int START = 0;
        final int STOP = 100;
        final int STEP = 1;

        for (int i = START; i < STOP; i += STEP) {
            System.out.print(i + (i < STOP - STEP ? ", " : "\n"));
        }
    }
}