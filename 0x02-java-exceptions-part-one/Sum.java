public class Sum {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: Sum <number> <number> ... <number>");
            System.exit(1);
        }

        int sum = 0;

        try {
            for (int i = 0; i < args.length; i++) {
                sum += Integer.parseInt(args[i]);
            }
        } catch (NumberFormatException numberFormatException) {
            System.err.println(numberFormatException.toString());
            System.exit(1);
        }

        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + (i < args.length - 1 ? " + " : " = "));
        }

        System.out.println(sum);
    }
}