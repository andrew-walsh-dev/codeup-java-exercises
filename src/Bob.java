import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input;
        boolean talking = true;
        while (talking){
            System.out.println("Bob: What do you want, bro?");
            input = in.nextLine();
            if (input.equals("")){
                System.out.println("Fine. Be that way!");
            }
            else if (input.endsWith("?")){
                System.out.println("Sure.");
            }
            else if (input.endsWith("!")){
                System.out.println("Whoa, chill out!");
            }
            else {
                System.out.println("Whatever.");
            }
            System.out.println("Will you leave me alone now? (Y/N)");
            talking = in.nextLine().equalsIgnoreCase("N");
        }
    }
}
