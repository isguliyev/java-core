public class DivideNumbers {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: DivideNumbers <number> <number> ... <number>");
            System.exit(1);
        }

        if (args.length == 1) {
            System.err.println("at least 2 arguments are required");
            System.exit(1);
        }

        double result = 0;

        try {
            result = Double.valueOf(args[0]);

            for (int i = 1; i < args.length; i++) {
                double divisor = Double.valueOf(args[i]);

                System.out.printf(
                    "%f / %f = %f\n",
                    result,
                    divisor,
                    result / divisor
                );

                result /= divisor;
            }
        } catch (NumberFormatException numberFormatException) {
            System.err.println("arguments must be real numbers");
            System.exit(1);
        }
    }
}