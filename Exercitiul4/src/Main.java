public class Main {

    // Se da un text.

    // 1. Sa se numere toate cuvintele care au lungimea mai mare decat 2, contin caracterul
    // "i" si caracterul "i" se afla pe o pozitie para


    // 2.

    public static void main(String[] args) {
        String text = "The Composite interface, along with CompositeContext, defines the methods to compose a draw " +
                "primitive with the underlying graphics area. After the Composite is set in the Graphics2D context, " +
                "it combines a shape, text, or an image being rendered with the colors that have already been rendered " +
                "according to pre-defined rules.";

        // E4.1
        int count = wordCount(text);
        System.out.println(". Numarul de cuvinte este: " + count);
    }


    public static int wordCount(String text) {
        int counter = 0;
        System.out.print("E4.1. Cuvintele sunt: ");
        String removeCommas = text.replace(",", "");
        String removeDots = removeCommas.replace(".", "");
        String[] wordArray = removeDots.split(" ");
        for (String s : wordArray) {
            if (s.length() > 2 && s.contains("i") && s.indexOf("i") % 2 == 0) {
                System.out.print(s + " ");
                counter++;
            }
        }
        return counter;
    }
}
