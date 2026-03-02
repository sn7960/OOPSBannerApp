public class OOPSBannerApp {
            // Method to generate the pattern for the letter 'O'
            public static String[] getOPattern() {
                return new String[]{
                        "   ***    ",
                        " **   **  ",
                        "**      **",
                        "**      **",
                        "**      **",
                        " **    ** ",
                        "   ***    "
                };
            }

            // Method to generate the pattern for the letter 'P'
            public static String[] getPPattern() {
                return new String[]{
                        " *****   ",
                        " **   ** ",
                        " **   ** ",
                        " *****   ",
                        " **      ",
                        " **      ",
                        " **      "
                };
            }

            // Method to generate the pattern for the letter 'S'
            public static String[] getSPattern() {
                return new String[]{
                        "  *****  ",
                        " **      ",
                        " **      ",
                        "  *****  ",
                        "       **",
                        "      ** ",
                        " *****   "
                };
            }

            // Main method to run the banner display
            public static void main(String[] args) {

                // Declare String arrays to hold patterns
                String[] oPattern = getOPattern();
                String[] pPattern = getPPattern();
                String[] sPattern = getSPattern();

                // Loop to assemble the word "OOPS"
                for (int i = 0; i < oPattern.length; i++) {

                    String line = String.join("  ",
                            oPattern[i],
                            oPattern[i],   // second O
                            pPattern[i],
                            sPattern[i]);

                    System.out.println(line);
                }
            }
        }
