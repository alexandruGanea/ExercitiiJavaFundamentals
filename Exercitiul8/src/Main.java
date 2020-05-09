import java.util.Scanner;

public class Main {

    // Vrem sa modelam comportamentul unui calculator simplu (adunare, scadere, inmultire, impartire)
    // Calculatorul sa fie reprezentat folosint OOP.

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        System.out.println("Suma numerelor este: " + calculator.sum(5, 10));
        System.out.println("Diferenta numerelor este: " + calculator.diff(10, 5));
        System.out.println("Inmultirea numerelor este: " + calculator.sum(2, 2));
        System.out.println("Impartirea numerleor este: " + calculator.div(10, 2));


        //de aici citim valorile din tastatura - obiectul care ne ajuta se numeste Scanner
        Scanner s1 = new Scanner(System.in);
        System.out.print("Va rugam introduceti primul numar: ");
        int n1 = s1.nextInt();
        System.out.print("Va rugam introduceti al doilea numar: ");
        int n2 = s1.nextInt();
        System.out.println("Numerele introduse de Dvs sunt: " + n1 + ", " + n2);

        // Afisam rezultatele operatiilor
        int sum = calculator.sum(n1, n2);
        System.out.println("Rezultatul adunarii este: " + sum);

        int diff = calculator.diff(n1, n2);
        System.out.println("Rezultatul scaderii este: " + diff);

        int mult = calculator.mult(n1, n2);
        System.out.println("Rezultatul inmultirii este: " + mult);

        int div = calculator.div(n1, n2);
        System.out.println("Rezultatul inmultirii este: " + div);

        // sa se modeleze un caculator stiintific care sa permita operatiilr calculatorului simplu, si in plus":
        // -- un numar ridicat la puterea altui numar
        // -- radical dintr-un numar
        // -- logaritm in baza 10 dintr-un numar
        // -- logaritm dintr-un numar

        CalculatorStiintific calculatorStiintific = new CalculatorStiintific();
        System.out.println("Rezultatul ridicarii la putere este: " + calculatorStiintific.exponentiation(2, 8));
        System.out.println("Rezultatul radicalului este: " + calculatorStiintific.sqrt(25));
        System.out.println("Rezultatul log10 este: " + calculatorStiintific.log10(25));
        System.out.println("Rezultatul log este: " + calculatorStiintific.log(55));


        Scanner s2 = new Scanner(System.in);
        System.out.println("Introduceti cifra operatiei: \n   1 - Ridicare la putere\n   2 - Radical\n   3 - Logaritm in baza 10\n   4 - Logaritm natural");
        int option = s2.nextInt();
        switch (option) {
            case 1:
                System.out.print("Introduceti primul numar: ");
                n1 = s2.nextInt();
                System.out.print("Introduceti al doilea numar: ");
                n2 = s2.nextInt();
                System.out.println("Rezultatul ridicarii la putere al numerelor " + n1 + " si " + n2 + " este: " + calculatorStiintific.exponentiation(n1, n2));
                break;
            case 2:
                System.out.print("Introduceti un numar: ");
                n1 = s2.nextInt();
                System.out.println("Rezultatul radicalului din " + n1 + " este: " + calculatorStiintific.sqrt(n1));
                break;
            case 3:
                System.out.print("Introduceti un numar: ");
                n1 = s2.nextInt();
                System.out.println("Rezultatul logaritmului in baza 10 a numarului " + n1 + " este: " + calculatorStiintific.log10(n1));
                break;
            case 4:
                System.out.print("Introduceti un numar: ");
                n1 = s2.nextInt();
                System.out.println("Rezultatul logaritmului natural al numcalculator stiintificarului " + n1 + " este: " + calculatorStiintific.log(n1));
                break;
            default:
                System.out.println("Numarul introdus nu corespunde unei operatii permise");
        }


        // Sa se introduca 2 numere
        //Afisam numerele
        // Sa se afiseze meniul
        // 1. Adunare
        // 2. Inmultire
        // 3. Radical
        // 4. Scadere
        // Afisam mesajul "Va rugam alegeti o optiune"
        //In functie de optiunea aleasa se realizeaza operatia respectiva, daca operatia presupune folosirea unui singur numar
        // facem operatia si ptr al doilea nr introdus
        // Afisam rezultatul


        Scanner s3 = new Scanner(System.in);
        System.out.println("Va rugam introduceti cele 2 numere");
        n1 = s3.nextInt();
        n2 = s3.nextInt();
        System.out.println("Numerele introduse sunt: " + n1 + " si " + n2);
        System.out.println("Operatii (alegeti numarul corespunzator, sau \"0\" ptr inapoi: \n  --1-- ADUNARE\n  --2-- INMULTIRE\n  --3-- RADICAL\n  --4-- SCADERE");
        int option2 = s3.nextInt();
        while (option2 != 0) {
            switch (option2) {
                case 1:
                    System.out.println("ADUNARE: Rezultatul este: " + calculatorStiintific.sum(n1, n2));
                    System.out.println("Introduceti  alt numar 1...4 pentru alta operatie, sau 0 ptr STOP");
                    break;
                case 2:
                    System.out.println("INMULTIRE: Rezultatul este " + calculatorStiintific.mult(n1, n2));
                    System.out.println("Introduceti  alt numar 1...4 pentru alta operatie, sau 0 ptr STOP");
                    break;
                case 3:
                    System.out.println("RADICAL: Rezultatul primului nr introdus este " + calculatorStiintific.sqrt((n1)));
                    System.out.println("RADICAL: Rezultatul celui de-al doilea nr introdus este " + calculatorStiintific.sqrt(n2));
                    System.out.println("Introduceti  alt numar 1...4 pentru alta operatie, sau 0 ptr STOP");
                    break;
                case 4:
                    System.out.println("SCADERE: Rezultatul este: " + calculatorStiintific.diff(n1, n2));
                    System.out.println("Introduceti  alt numar 1...4 pentru alta operatie, sau 0 ptr STOP");
                    break;
                default:
                    System.out.println("Optiunea aleasa nu exista, vezi meniul.");
                    System.out.println("Introduceti  alt numar 1...4 pentru alta operatie, sau 0 ptr STOP");
            }
            option2 = s3.nextInt();
        }
        System.out.println("Ati apasat 0. O zi buna!");
    }

}


