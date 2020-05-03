public class Main {
    public static void main(String[] args) {
        // Care este cel mai mare numar dintr-un Array
        //Avem un vector de 10 int, returnam cel mai mare numar.

        int[] array = {234, 535, 575, 346, 5788, 4567, 7767, 33353, 33545, 656};
        int maxNmbr = greatestNmbr(array);
        System.out.println("Numarul cel mai mare din array este: " + maxNmbr);

    }


    public static int greatestNmbr(int[] array) {
        int max = 0;
        for (int c = 0; c < array.length; c++) {
            if (array[c] >= max) {
                max = array[c];
            }
        }
        return max;
    }
}
