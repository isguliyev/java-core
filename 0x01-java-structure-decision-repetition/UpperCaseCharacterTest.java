public class UpperCaseCharacterTest {
    public static void main(String[] args) {
        final char[] characters = {'a', 'B', 'd', 'f', 'G'};

        for (int i = 0; i < characters.length; i++) {
            System.out.printf(
                "'%c' is upper case: %b\n",
                characters[i],
                Character.isUpperCase(characters[i])
            );
        }
    }
}