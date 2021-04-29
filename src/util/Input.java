package util;
import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }
    public String getString(){
        System.out.println("Enter a string: ");
        return scanner.nextLine();
    }
    public boolean yesNo(){
        System.out.println("Yes or no?");
        String input = scanner.next();
        return input.equalsIgnoreCase("Yes") || input.equalsIgnoreCase("Y");
    }
    public int getInt(int min, int max){
        int input;
        while (true){
            System.out.printf("Enter an integer between %d and %d: ", min, max );
            input = scanner.nextInt();
            if (input >= min && input <= max){
                return input;
            }
        }
    }
    public int getInt(){
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
    }
    public double getDouble(double min, double max){
        double input;
        while (true){
            System.out.printf("Enter a double between %.3f and %.3f: ", min, max );
            input = scanner.nextDouble();
            if (input >= min && input <= max){
                return input;
            }
        }
    }
    public double getDouble(){
        System.out.println("Enter a double: ");
        return scanner.nextDouble();
    }
}
