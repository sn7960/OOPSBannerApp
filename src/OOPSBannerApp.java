/**
 * OOPSBannerApp - UC7
 * Store Character Pattern in a Static Inner Class
 */
public class OOPSBannerApp {

    /**
     * CharacterPatternMap Inner Static Class
     */
    static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor
         * @param character the character to be mapped
         * @param pattern the ASCII art pattern (7 lines)
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * @return the mapped character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * @return the pattern array
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Creates CharacterPatternMap array
     * @return array of CharacterPatternMap objects
     */
    public static CharacterPatternMap[] createCharacterPatternMaps() {

        CharacterPatternMap[] maps = new CharacterPatternMap[4];

        maps[0] = new CharacterPatternMap('O', new String[]{
                "    ***   ",
                " **    ** ",
                "**      **",
                "**      **",
                "**      **",
                " **   **  ",
                "   ***    "
        });

        maps[1] = new CharacterPatternMap('P', new String[]{
                " ***** ",
                " **   ** ",
                " **   ** ",
                " ***** ",
                " **     ",
                " **     ",
                " **     "
        });

        maps[2] = new CharacterPatternMap('S', new String[]{
                "  *****",
                " **     ",
                " **     ",
                "   ***",
                "      **",
                "      **",
                " ***** "
        });

        maps[3] = new CharacterPatternMap(' ', new String[]{
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       ",
                "       "
        });

        return maps;
    }

    /**
     * Retrieves pattern for a character
     * @param ch character to look up
     * @param charMaps array of CharacterPatternMap
     * @return pattern array
     */
    public static String[] getCharacterPattern(char ch,
                                               CharacterPatternMap[] charMaps) {

        for (int i = 0; i < charMaps.length; i++) {
            if (charMaps[i].getCharacter() == ch) {
                return charMaps[i].getPattern();
            }
        }

        return charMaps[3].getPattern();
    }

    /**
     * Prints message as ASCII banner
     * @param message message to display
     * @param charMaps available character maps
     */
    public static void printMessage(String message,
                                    CharacterPatternMap[] charMaps) {

        for (int row = 0; row < 7; row++) {

            StringBuilder builder = new StringBuilder();

            for (int i = 0; i < message.length(); i++) {

                char ch = message.charAt(i);
                String[] pattern = getCharacterPattern(ch, charMaps);
                builder.append(pattern[row]).append("  ");
            }

            System.out.println(builder.toString());
        }
    }

    /**
     * Main Method
     * @param args command line arguments
     */
    public static void main(String[] args) {

        CharacterPatternMap[] charMaps = createCharacterPatternMaps();

        String message = "OOPS";

        printMessage(message, charMaps);
    }
}