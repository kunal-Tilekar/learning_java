import java.util.Scanner;
public class mad_libs_game {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        String adj1;
        String adj2;
        String noun1;
        String noun2;
        String verb;

        System.out.print("Enter an adjective (describe weather): ");
        adj1 = s.nextLine();
    System.out.print("Enter an adjective (describe a singer): ");
        adj2 = s.nextLine();
    System.out.print("Enter a Noun (animal): ");
        noun1 = s.nextLine();
    System.out.print("Enter a Noun (place): ");
        noun2 = s.nextLine();
    System.out.print("Enter a verb (action + ing): ");
        verb = s.nextLine();

        System.out.println("It was a very "+adj1+ " evening!");
        System.out.println("She was a very "+adj2 +" Singer");
        System.out.println("I saw a "+noun1+ " at an exhibition ");
        System.out.println(noun2+ " Was a very beautiful place");
        System.out.println("he was " +verb+ " Very nicely");

        s.close();





    }
}
