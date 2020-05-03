public class Main {

    // Se da un array de caractere. Sa se afiseze in ordine inversa

    public static void main(String[] args) {

        char[] charArray = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        reverseArray(charArray);
    }

    public static void reverseArray(char[] charArray){
        System.out.print("Array-ul afisat in ordine inversa: ");
        for(int c=charArray.length-1; c>=0; c--){
            System.out.print(charArray[c] + " ");
        }
    }
}
