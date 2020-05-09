import java.util.Scanner;

public class Main {

    // Sa se modeleze cosuri de cumparaturi dintr-un supermarket
    // Fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret. Ex "Mere, 5 lei"
    // Cosul de cumparaturi va fi reprezentat de un array de produse
    // Sa se afiseze un meniu cu produsele pe care vrem sa le cumparam
    // Bazat pe ce introduce utilizatorul de la tastatura, adaugam in cosul de cumparaturi
    // Sa calculam costul total de cumparaturi
    // Simulam plata ptr cosul de cumparaturi - acesta se goleste

    public static void main(String[] args) {

        Product[] shoppingCart = new Product[10];
        System.out.println("Meniu cumparaturi:");
        System.out.println("1. Mere");
        System.out.println("2. Maturi");
        System.out.println("3. Set de farfurii");
        System.out.println("4. Mustar");
        System.out.println("5. Apa");
        System.out.println("6. Bere");
        System.out.println("7. Masline");
        System.out.println("8. Suc");
        System.out.println("9. Paine");
        System.out.println("Va rugam sa alegeti produsele dorite");
        Scanner s = new Scanner(System.in);
        int option = s.nextInt();

        while (option != 0) {
            switch (option) {
                case 1:
                    Product mere = new Product("mere", 5);
                    System.out.println("Ati adaugat " + mere.getName());
                    shoppingCart[0] = mere;
                    break;
                case 2:
                    Product matura = new Product("matura", 6);
                    System.out.println("Ati adaugat o " + matura.getName());
                    shoppingCart[1] = matura;
                    break;
                case 3:
                    Product farfurii = new Product("set farfurii", 10);
                    System.out.println("Ati adaugat un " + farfurii.getName());
                    shoppingCart[2] = farfurii;
                    break;
                case 4:
                    Product mustar = new Product("mustar", 4);
                    System.out.println("Ati adaugat " + mustar.getName());
                    shoppingCart[3] = mustar;
                    break;
                case 5:
                    Product apa = new Product("apa", 3);
                    System.out.println("Ati adaugat " + apa.getName());
                    shoppingCart[4] = apa;
                    break;
                case 6:
                    Product bere = new Product("bere", 3);
                    System.out.println("Ati adaugat " + bere.getName());
                    shoppingCart[5] = bere;
                    break;
                case 7:
                    Product masline = new Product("masline", 10);
                    System.out.println("Ati adaugat " + masline.getName());
                    shoppingCart[6] = masline;
                    break;
                case 8:
                    Product suc = new Product("suc", 5);
                    System.out.println("Ati adaugat " + suc.getName());
                    shoppingCart[7] = suc;
                    break;
                case 9:
                    Product paine = new Product("set paine", 6);
                    System.out.println("Ati adaugat " + paine.getName());
                    shoppingCart[8] = paine;
                    break;
                default:
                    System.out.println("Nu avem de-aia, cauta in alta parte");
            }

            option = s.nextInt();
        }
        System.out.println("Ati apasat tasta 0. Programul se inchide. O zi buna!");
        int counter = 1;
        System.out.println("Ati cumparat: ");
        System.out.println("Lungime cos cumparaturi: " + shoppingCart.length);

        //Afisam numele si produsul fiecarui produs din array
        for (Product product : shoppingCart) {
            if (product != null) {
                System.out.println(counter + ". " + product.getName() + " la pretul de " + product.getPrice() + " lei.");
                counter++;
            }
        }

        //Calculam pretul total
        int totalPrice = 0;
        for (Product price : shoppingCart) {
            if (price != null) {
                totalPrice += price.getPrice();
            }
        }
        System.out.println("Pretul total este: " + totalPrice + " lei.");

        System.out.println("S-a platit suma de " + totalPrice + " lei.");
        totalPrice = 0;
    }
}
