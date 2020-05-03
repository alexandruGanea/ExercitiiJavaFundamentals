public class Main {

    // Se da un text
    // Sa se afiseze toate cuvintele care incep cu litera "s" SAU cu litera "d"
    // Sa se afiseze litera de la pozitia 3 din fiecare cuvant

    public static void main(String[] args) {

        String text = "Since this interface must expose the contents of pixels on the target device or image to " +
                "potentially arbitrary code, the use of custom objects which implement this interface when rendering " +
                "directly to a screen device is governed by the readDisplayPixels AWTPermission. The permission check " +
                "will occur when such a custom object is passed to the setComposite method of a Graphics2D retrieved " +
                "from a Component.";
        showWords(text);
        showLetters(text);

    }

    public static void showWords(String text) {
        text = text.toLowerCase();
        System.out.print("Cuvintele care incep cu S sau D sunt: ");
        String[] textArray = text.split(" ");
        for (String s : textArray) {
            if (s.startsWith("s") || s.startsWith("d")) {
                System.out.print(s + " ");
            }
        }
    }

    public static void showLetters(String text) {
        String[] textArray = text.split(" ");
        System.out.print("\nLiterele de la pozitia 3 sunt: ");
        for (String s : textArray) {
            if (s.length() > 3) {
                System.out.print(s.charAt(3));
            }
            if (s.equals(textArray[textArray.length - 1])) {
                System.out.println(". ");
            } else {
                System.out.print(", ");
            }
        }
    }
}
