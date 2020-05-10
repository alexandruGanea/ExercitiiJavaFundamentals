public class StringCalc extends CalculatorStiintific {

    public StringCalc() {
    }

    public String concat(String s1, String s2) {
        return s1.concat(s2);
    }

    public boolean stringContains(String s1, String c) {
        return s1.contains(c);
    }

    public int stringLengthSum(String s1, String s2) {
        return s1.length() + s2.length();
    }

    public boolean oddOrEvenStringLength(String s1) {
        return s1.length() % 2 == 0;
    }

    public char[] string2chars(String s1) {
        return s1.toCharArray();
        }

    public boolean checkVowel(String s1) {
        s1 = s1.toLowerCase();
        return s1.startsWith("a") || s1.startsWith("e") || s1.startsWith("i") || s1.startsWith("o") || s1.startsWith("u");
    }

    public int countSpaces(String s1) {
        int counter = 0;
        for (int c = 0; c < s1.length(); c++) {
            if (s1.charAt(c) == ' ') {
                counter++;
            }
        }
        return counter;
    }
}
