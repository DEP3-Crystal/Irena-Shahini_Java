import java.util.*;

public class RandomEx {
    public static void main(String[] args) {

        List<String> data = new ArrayList<>(Arrays.asList(
                "isuf.muca@crystal-system.eu", "danjel.halili@crystal-system.eu", "flavio.lorenci@crystal-system.eu",
                "elia.omeri@crystal-system.eu", "ardit.elezi@crystal-system.eu", "luka.buziu@crystal-system.eu",
                "megi.lala@crystal-system.eu", "irena.shahini@crystal-system.eu", "indrit.vaka@crystal-system.eu",
                "griselda.5muci@crystal-system.eu", "theodor.gheorghe@crystal-system.eu", "ioan.cocianu@crystal-system.eu",
                "teofil.mitrea@crystal-system.eu", "eduard.tiutiu@crystal-system.eu", "george.dobrota@crystal-system.eu",
                "stefanita.plesa@crystal-system.eu", "adrian-nicolae.tigau@crystal-system.eu", "emanuel.grabovschi@crystal-system.eu",
                "george.sirbu@crystal-system.eu", "andrei.state@crystal-system.eu", "florin-adrian.dumitru@crystal-system.eu",
                "victor.hincu@crystal-system.eu"));
        Random rand = new Random();

        Scanner input = new Scanner(System.in);
        List<String> choices = new ArrayList<>();
        int randomInt = rand.nextInt(data.size());
        int userChoice = 0;

        do {
            System.out.println("Press 1 if you want to see all");
            System.out.println("Press 2 if you want to choose a person.");
            System.out.println("Press 3 to  display a list of previous selected participant");
            System.out.println("Press 0 to Quit");
            System.out.println("------------------------------------------------------- \n");
            userChoice = input.nextInt();
            switch (userChoice) {
                case 1:
                    if (data.size() != 0) {
                        System.out.println(Arrays.toString(data.toArray()));
                    } else {
                        System.out.println("Your list is empty! You don't have any data!");
                    }
                    break;

                //choosing a random person
                case 2:
                    if (data.size() > 0) {
                        System.out.println(data.get(randomInt));
                        choices.add(data.get(randomInt));
                        data.remove(randomInt);

                    } else {
                        System.out.println("You don't have data!!");
                    }
                    break;
                case 3:
                    System.out.println(Arrays.toString(choices.toArray()));
                    break;
                //quit
                case 0:
                    System.exit(0);
                    //default case to display the message invalid choice made by the user
                default:
                    System.err.println("Invalid choice!!! Please make a valid choice. \\n\\n");
            }
           }
            while (userChoice != 0);
         }
       }

