public class DivideNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: DivideNumbers <number> <number> ... <number>");
            System.exit(0);
        }

        double result = 0;

        try {
            result = Double.valueOf(args[0]);

            for (int i = 1; i < args.length; i++) {
                System.out.printf(
                    "%f / %f = %f\n",
                    result,
                    Double.valueOf(args[i]),
                    result / Double.valueOf(args[i])
                );

                result /= Double.valueOf(args[i]);
            }
        } catch (NumberFormatException numberFormatException) {
            System.err.println("arguments must be real numbers");
            System.exit(1);
        }
    }
}