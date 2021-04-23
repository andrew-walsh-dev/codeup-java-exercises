import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f\n", pi);
        System.out.print("Enter an integer: ");
        int myInt = in.nextInt();
        System.out.print("Enter three words: ");
        String wordOne = in.next();
        String wordTwo = in.next();
        String wordThree = in.next();
        in.nextLine();
        System.out.printf("%s\n%s\n%s\n", wordOne, wordTwo, wordThree);
        System.out.print("Enter a sentence: ");
        String sentence = in.nextLine();
        System.out.println(sentence);
        System.out.print("Enter classroom width and height: ");
        double width = Float.parseFloat(in.next());
        double height = Float.parseFloat(in.next());
        System.out.printf("Area of classroom: %.2f sq. units\n", width * height);
        System.out.printf("Perimeter of classroom: %.2f units", 2 * width + 2 * height);
    }
}
