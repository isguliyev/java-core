public class DrawRectangle {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.err.println("Usage: DrawRectangle <width> <height>");
            System.exit(1);
        }

        int width = 0;
        int height = 0;

        try {
            width = Integer.parseInt(args[0]);
            height = Integer.parseInt(args[1]);
        } catch (NumberFormatException numberFormatException) {
            System.err.println("width and height must be positive integers");
            System.exit(1);
        }

        if (width  <= 0 || height <= 0) {
            System.err.println("width and height must be positive integers");
            System.exit(1);
        }

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                boolean isTopOrBottom = i == 0 || i == height - 1;
                boolean isRightOrLeft = j == 0 || j == width - 1;

                if (isTopOrBottom && isRightOrLeft) {
                    System.out.print("+");
                } else if (isTopOrBottom) {
                    System.out.print("-");
                } else if (isRightOrLeft) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}