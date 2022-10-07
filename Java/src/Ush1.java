import java.util.*;

public class Ush1 {
    // The first part, in which we choose a person at random from the whole list of participants, is done.
    // That works great, but I would also love if:
    //- I can exclude the most recent person that presented
    //- other people that presented in the past (except the last person) had smaller chances of being selected
    //- the program displays a list of previous selected persons
    List<String> persons = new ArrayList<>(Arrays.asList(
            "isuf.muca@crystal-system.eu","danjel.halili@crystal-system.eu", "flavio.lorenci@crystal-system.eu",
            "elia.omeri@crystal-system.eu", "ardit.elezi@crystal-system.eu", "luka.buziu@crystal-system.eu",
            "megi.lala@crystal-system.eu", "irena.shahini@crystal-system.eu", "indrit.vaka@crystal-system.eu",
            "griselda.muci@crystal-system.eu", "theodor.gheorghe@crystal-system.eu", "ioan.cocianu@crystal-system.eu",
            "teofil.mitrea@crystal-system.eu", "eduard.tiutiu@crystal-system.eu", "george.dobrota@crystal-system.eu",
            "stefanita.plesa@crystal-system.eu", "adrian-nicolae.tigau@crystal-system.eu", "emanuel.grabovschi@crystal-system.eu",
            "george.sirbu@crystal-system.eu", "andrei.state@crystal-system.eu", "florin-adrian.dumitru@crystal-system.eu",
            "victor.hincu@crystal-system.eu"));
    List<String> chosen = new ArrayList<>();
    Random random = new Random();
    int randomIndex = random.nextInt(persons.size());
    String lastChosen = persons.get(randomIndex);
    {
        chosen.add(lastChosen);

    Scanner input = new Scanner(System.in);

//            System.out.println("Do you to continue? Pres 1 for yes and n for 0!");
//            char answer = input.nextLine().charAt(0);
//            if (answer != 1 || answer != 0) {
//                System.out.println("Wrong answer!");
//            } else{
//
//            }
    }
    public static void main(String[] args){
        Ush1 ex = new Ush1();
        System.out.println(ex.lastChosen);
        System.out.println(ex.chosen);
    }
}
