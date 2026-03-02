import java.util.HashMap;

public class OOPSBannerApp {

    /**
     * Creates a HashMap containing ASCII art patterns for supported characters.
     * Each character is mapped to a String array where each element
     * represents one line of the ASCII art pattern.
     *
     * @return HashMap<Character, String[]> containing character patterns
     */
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // Pattern for 'O'
        charMap.put('O', new String[]{
                "   ***   ",
                " **   ** ",
                "**     **",
                "**     **",
                "**     **",
                " **   ** ",
                "   ***   "

        });

        // Pattern for 'P'
        charMap.put('P', new String[]{
                "*****  ",
                "**   **",
                "**   **",
                "****   ",
                "**     ",
                "**     ",
                "**     "

        });

        // Pattern for 'S'
        charMap.put('S', new String[]{
                " ****",
                "**     ",
                " **     ",
                "  **** ",
                "     **",
                "    **",
                "**** "
        });

        return charMap;
    }

    /**
     * Displays the banner message using the provided character map.
     *
     * @param message The message to display (e.g., "OOPS")
     * @param charMap The HashMap containing character patterns
     */
    public static void displayBanner(String message, HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length; // Assuming all patterns same height

        // Outer loop → for each row
        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            // Inner loop → for each character in message
            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append("  "); // Space between letters
                }
            }

            System.out.println(sb.toString());
        }
    }

    public static void main(String[] args) {

        HashMap<Character, String[]> charMap = createCharacterMap();

        displayBanner("OOPS", charMap);
    }
}