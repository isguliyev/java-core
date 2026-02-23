public class Program {
    public static void main(String[] args) {
        System.out.printf(
            "Testing Addition - %b\n",
            BasicOperationTest.test_addition()
        );

        System.out.printf(
            "Testing Subtraction - %b\n",
            BasicOperationTest.test_subtraction()
        );

        System.out.printf(
            "Testing Multiplication - %b\n",
            BasicOperationTest.test_multiplication()
        );

        System.out.printf(
            "Testing Division - %b\n",
            BasicOperationTest.test_division()
        );
    }
}