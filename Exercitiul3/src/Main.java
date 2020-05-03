public class Main {

    // Se da un text. Sa se numere cuvintele care au lungime impara si se termina cu litera 'E'

    public static void main(String[] args) {

        String text1 = "The scope of this variable extends from its declaration to the end of the block governed by the " +
                "for statement, so it can be used in the termination and increment expressions as well.";

        int counter = wordCount(text1);
        System.out.println("Ex3. Numarul de cuvinte cu lungime impara si care se termina cu \"e\" este: " + counter);


    }

    public static int wordCount(String text1){
        String[] stringArray = text1.split(" ");
        System.out.print("Cuvintele cerute sunt: ");
        int count = 0;
        for(int c=0;  c<stringArray.length; c++){
            if (stringArray[c].length()%2!=0){
                if(stringArray[c].endsWith("e")){
                    System.out.print(stringArray[c] + ", ");
                    count++;
                }
            }
        }
        return count;
    }

}
