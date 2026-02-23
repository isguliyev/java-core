public class Program {
    public static void main(String[] args) {
        System.out.printf(
            "Valid Email Test - %b\n",
            EmailTest.test_email_with_at_symbol()
        );

        System.out.printf(
            "Email Test Without @ Symbol - %b\n",
            EmailTest.test_email_without_at_symbol()
        );

        System.out.printf(
            "Email Test With More Than 50 Characters - %b\n",
            EmailTest.test_email_over_50_characters()
        );
    }
}