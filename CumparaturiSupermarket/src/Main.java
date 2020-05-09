import java.util.Date;
import java.util.Scanner;

public class Main {

    // Sa se modeleze cosuri de cumparaturi dintr-un supermarket
    // Fiecare produs sa fie reprezentat de un obiect care sa contina nume si pret. Ex "Mere, 5 lei"
    // Cosul de cumparaturi va fi reprezentat de un array de produse
    // Sa se afiseze un meniu cu produsele pe care vrem sa le cumparam
    // Bazat pe ce introduce utilizatorul de la tastatura, adaugam in cosul de cumparaturi
    // Sa calculam costul total de cumparaturi
    // Simulam plata ptr cosul de cumparaturi - acesta se goleste
    // Sa se reprezinte si produse care sunt perisabile, acestea vor ave in plus data expirarii
    // Sa se simuleze din nou un cos de cumparaturi si  daca utilizatorul selecteaza un produ perisabil si data de
    // expirare e depasita, com afisa mesajul "Produsul e expirat" si nu il vom mai adauga in cos.
    // Sa adaugam alergeni si cand afisam cosul de cumpraraturi sa afisam si alergenii
    // Facem un cos de cumparaturi ptr produsele normale, non-alimentare si un cos ptr cele alimentare la care afisam expirare si alergeni.

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

        Date today = new Date();

        FoodProduct[] foodsCart = new FoodProduct[3];
        Product[] nonFoodsCart = new Product[3];


        System.out.println("Meniu:\n  --1-- Carne\n  --2-- Oua\n  --3-- Lapte\n  --4-- Matura\n  --5-- Bec\n  --6-- Pronto");
        option = s.nextInt();
        while (option != 0) {
            switch (option) {
                case 1:
                    FoodProduct carne = new FoodProduct("carne", 6, "trichineloza", new Date(2020, 5, 15));
                    System.out.println("Ati ales " + carne.getName());
                    foodsCart[0] = carne;
                    break;
                case 2:
                    FoodProduct oua = new FoodProduct("oua", 10, "condimente", new Date(2020, 2, 1));
                    System.out.println("Ati ales " + oua.getName());
                    foodsCart[1] = oua;
                    break;
                case 3:
                    FoodProduct lapte = new FoodProduct("lapte", 10, "lactoza", new Date(2020, 6, 1));
                    System.out.println("Ati ales " + lapte.getName());
                    foodsCart[2] = lapte;
                    break;
                case 4:
                    Product matura = new Product("matura", 11);
                    System.out.println("Ati ales " + matura.getName());
                    nonFoodsCart[0] = matura;
                    break;
                case 5:
                    Product bec = new Product("bec", 12);
                    System.out.println("Ati ales " + bec.getName());
                    nonFoodsCart[1] = bec;
                    break;
                case 6:
                    Product pronto = new Product("Pronto", 15);
                    System.out.println("Ati ales " + pronto.getName());
                    nonFoodsCart[2] = pronto;
                    break;
                default:
                    System.out.println("Produsul nu este pe stoc.");
            }
            option = s.nextInt();
        }
        System.out.println("Gata cumparaturile, ai apasat 0.");

        System.out.println("Acestea sunt produsele non-alimentare din cos: ");
        counter = 1;
        int nonFoodPrice = 0;
        for (Product product : nonFoodsCart) {
            if (product != null) {
                System.out.println(counter + ". " + product.getName() + " la pretul de " + product.getPrice() + " lei");
                nonFoodPrice += product.getPrice();
                counter++;
            }
        }

        System.out.println("Acestea sunt produsele alimentare din cos: ");
        counter = 1;
        int foodPrice = 0;
        for (FoodProduct foodProduct : foodsCart) {
            if (foodProduct != null) {
                System.out.print(counter + ". " + foodProduct.getName() + " la pretul de " + foodProduct.getPrice() + " lei. ");
                System.out.print("Alergeni: " + foodProduct.getAlergens() + ". ");
                System.out.println("Data expirare: " + foodProduct.getExpirationDate() + ". ");
                counter++;
                if (foodProduct.getExpirationDate() != null && foodProduct.getExpirationDate().before(today)) {
                    System.out.println("Produsul este expirat");
                    foodProduct = null;
                }
            }
        }

        for (Product price : nonFoodsCart) {
            if (price != null) {
                nonFoodPrice += price.getPrice();
            }
        }
        System.out.println("Pretul produselor non-alimentare este: " + nonFoodPrice);

        for (FoodProduct price : foodsCart) {
            if (price != null) {
                foodPrice += price.getPrice();
            }
        }
        System.out.println("Pretul produselor alimentare este: " + foodPrice);
        int fullPrice = foodPrice + nonFoodPrice;
        System.out.println("Pretul total al produselor este: " + fullPrice);
    }
}
