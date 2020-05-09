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
        Scanner scanner = new Scanner(System.in);
        System.out.print("Va rugam introduceti primul numar: ");
        int n1 = scanner.nextInt();
        System.out.print("Va rugam introduceti al doilea numar: ");
        int n2 = scanner.nextInt();
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

    }

}

