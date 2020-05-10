import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Sa se modeleze o sedinta de personal trining. Vom avea:
        // - Trainee - are NAME, STAMINA, STRENGTH
        //  -- o sa se antreneze lunea (CARDIO: STAMINA -30 "A ars 300 calorii"), miercurea (BODY PUMP: STAMINA -50, "A ars 500 calorii") si vinerea (BOX: STAMINA -70, "A ars 250 calorii")
        //  -- o sa porneasca cu STAMINA 1000 (cand stamina ajunge la 0, il punem sa se odhineasca, PUTEREA 50
        //  -- de fiecare data cand face exercitiul o sa ii scada STAMINA
        //  -- de fiecare data cand face exercitiul o sa ii creasca PUTEREA


        // Utilizatorul sa introduca de la tastatura ziua curenta.
        Scanner s = new Scanner(System.in);
        System.out.println("Introduceti numele trainee-ului");
        String inputName = s.nextLine();
        Trainee name = new Trainee(inputName);
        System.out.print("Introduceti ziua curenta: ");
        String day = s.nextLine();
        while ((day.equals("luni") || day.equals("miercuri") || day.equals("vineri")) && name.getStamina() > 0) {
            switch (day) {
                case "luni":
                    name.cardio();
                    System.out.println("Stamina lui " + name.getName() + " a ajuns la " + name.getStamina());
                    break;
                case "miercuri":
                    name.bodyPump();
                    System.out.println("Stamina lui " + name.getName() + " a ajuns la " + name.getStamina());
                    break;
                case "vineri":
                    name.boxing();
                    System.out.println("Stamina lui " + name.getName() + " a ajuns la " + name.getStamina());
                    break;
                default:
                    System.out.println("Nu am gasit ziua introdusa ");
                    break;
            }
            day = s.nextLine();
        }
        if (!day.equals("luni") || !day.equals("miercuri") || !day.equals("vineri")) {
            System.out.println(day + " nu e o zi de training ptr " + name.getName());
        }
        if (name.getStamina() <= 0) {
            System.out.println("Trainee-ul " + name.getName() + " a obosit si se odihneste.");
        }
        System.out.println("Puterea trainee-ului " + name.getName() + " a ajuns la " + name.getStrength());
    }
}
