public class PrintStringConcatenation {
    public static void main(String[] args) {
        final String text1 = "Hello, ";
        final String text2 = "World!";

        System.out.printf("\"%s\" + \"%s\" -> \"%s\"\n", text1, text2, text1 + text2);
    }
}