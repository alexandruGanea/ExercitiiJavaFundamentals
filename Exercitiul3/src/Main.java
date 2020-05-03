public class Main {

    // Se da un text. Sa se numere cuvintele care au lungime impara si se termina cu litera 'E'

    public static void main(String[] args) {

        String text1 = "The scope of this variable extends from its declaration to the end of the block governed by the " +
                "for statement, so it can be used in the termination and increment expressions as well.";

        int counter = wordCount(text1);
        System.out.println(". Numarul de cuvinte cu lungime impara si care se termina cu \"e\" este: " + counter);


    }

    public static int wordCount(String text1) {
        String[] stringArray = text1.split(" ");
        System.out.print("Ex3. Cuvintele cerute sunt: ");
        int count = 0;
        for (String s : stringArray) {
            if (s.length() % 2 != 0 && s.endsWith("e")) {
                System.out.print(s + ", ");
                count++;
            }
        }
        return count;
    }

}
