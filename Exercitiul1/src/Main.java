public class Main {
    public static void main(String[] args) {

        // Scrieti o functie care primeste 2 String-uri ca parametru si verifica daca primul String il contine pe al doilea.

        String string1 = "Ana are pere de aceasta data. Ionel vrea si el, dar nu primeste.";
        String string2 = "are pere";
        System.out.print("Ex1. ");

        stringContains(string1, string2);
    }

    public static void stringContains(String string1, String string2) {
        if (string1.contains(string2)) {
            System.out.println("\"" + string2 + "\"" + " este inclus in " + "\"" + string1 + "\"");
        } else {
            System.out.println("\"" + string2 + "\"" + " nu este inclus in " + "\"" + string1 + "\"");
        }
    }
}
