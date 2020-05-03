public class Main {

    // Se da un array de 7 cuvinte. Sa se concateneze  si sa se afiseze cuvintele de pe pozitiile divizibile cu 3 si mai mari decat 0

    public static void main(String[] args) {
        String[] wordsArray = {"Ana", "are", "mere", "si", "nu", "da", "nimanui"};

        System.out.print("Noul text concatenat: ");
        wordsConcat(wordsArray);

    }

    public static void wordsConcat(String[] wordsArray) {
        String newText = "";
        for (int c = 1; c < wordsArray.length; c++) {
            if (c % 3 == 0) {
                newText = newText + wordsArray[c];
            }
        }
        System.out.println(newText);
    }
}
