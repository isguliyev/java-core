public class PrintStringConcatenation {
    public static void main(String[] args) {
        final String text1 = "Hello, ";
        final String text2 = "World!";
        final String completeText = text1 + text2;

        System.out.printf("\"%s\" + \"%s\" -> \"%s\"\n", text1, text2, completeText);
    }
}