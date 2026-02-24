/**
 * BannerApp
 *
 * UC7: Store character patterns using an inner static class.
 * Demonstrates encapsulation, modularity, and reusability.
 *
 * @author Vidit
 * @version 1.6
 */
public class BannerApp {

    /**
     * Inner static class to store character and its banner pattern
     */
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        /**
         * Constructor to initialize character and pattern
         * @param character the character
         * @param pattern 7-line banner pattern
         */
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns pattern line at given row
         * @param row index of banner row
         * @return pattern string
         */
        public String getPatternLine(int row) {
            return pattern[row];
        }

        /**
         * Returns stored character
         * @return character
         */
        public char getCharacter() {
            return character;
        }
    }

    // Utility method to build banner line
    static String buildLine(CharacterPattern[] patterns, int row) {
        StringBuilder sb = new StringBuilder();

        for (CharacterPattern cp : patterns) {
            sb.append(cp.getPatternLine(row));
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Create pattern objects
        CharacterPattern O = new CharacterPattern('O', new String[]{
                "  *****   ",
                " *     *  ",
                "*       * ",
                "*       * ",
                "*       * ",
                " *     *  ",
                "  *****   "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                "  ******  ",
                " *     *  ",
                "*       * ",
                " ******   ",
                "*         ",
                "*         ",
                "*         "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "  ******  ",
                " *        ",
                "*         ",
                "  *****   ",
                "       *  ",
                " *     *  ",
                "  *****   "
        });

        // Word OOPS → using array of objects
        CharacterPattern[] word = {O, O, P, S};

        // Print banner
        for (int i = 0; i < 7; i++) {
            System.out.println(buildLine(word, i));
        }
    }
}