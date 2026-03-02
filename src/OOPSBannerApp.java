public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] line = {
                String.join(" ", "   ***     ", "   ***     ", "  *****     ", "   *****   "),
                String.join(" ", " **   **   ", " **   **   ", "  **   **   ", " **        "),
                String.join(" ", "**     **  ", "**     **  ", "  **   **   ", "  **        "),
                String.join(" ", "**     **  ", "**     **  ", "  *****     ", "    ***    "),
                String.join(" ", "**     **  ", "**     **  ", "  **        ", "        **  "),
                String.join(" ", " **   **   ", " **   **   ", "  **        ", "       **    "),
                String.join(" ", "   ***     ", "   ***     ", "  **        ", "  *****    ")
        };
        for (String lines : line) {
            System.out.println(lines);
        }
    }
}