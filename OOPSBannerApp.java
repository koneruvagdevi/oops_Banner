/**
 * OOPS Banner Application
 *
 * UC5: Declare and initialize banner lines in a single
 * statement using String.join(), then print using a loop.
 *
 * @version 5.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] bannerLines = {
            String.join("", " *****   ", " *****   ", " ******   ", " ***** "),
            String.join("", "*     * ", "*     * ", "*        ", "*     *"),
            String.join("", "*     * ", "*     * ", "*        ", "*      "),
            String.join("", "*     * ", "*     * ", " ******  ", " ***** "),
            String.join("", "*     * ", "*     * ", "*        ", "      *"),
            String.join("", "*     * ", "*     * ", "*        ", "*     *"),
            String.join("", " *****   ", " *****   ", " *        ", " ***** ")
        };

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}