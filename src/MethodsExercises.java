import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(5, 7));
        System.out.println(subtraction(23, 6));
        System.out.println(multiplication(20, 20));
        System.out.println(division(300, 60));
        factorial();
    }
    public static double addition(double a, double b) {
        return a + b;
    }
    public static double subtraction(double a, double b) {
        return a - b;
    }
    public static double multiplication(double a, double b) {
        return a * b;
    }
    public static double division(double a, double b) {
        return a / b;
    }
    public static double modulus(double a, double b) {
        return a % b;
    }
    public static int getInteger(int min, int max){
        Scanner in = new Scanner(System.in);
        int num;
        do{
            System.out.printf("Enter an integer between %d and %d: ", min, max);
            num = in.nextInt();
            in.nextLine();
        } while (num > max || num < min);
        return num;
    }
    public static void factorial(){
        Scanner in = new Scanner(System.in);
        int num;
        long result;
        String choice;
        while (true){
            while (true){
                System.out.print("Enter an integer between 1 and 10: ");
                num = in.nextInt();
                if (num >= 1 && num <= 10){
                    break;
                }
            }
            result = 1;
            for (int i = 2; i <= num; i++) {
                result *= i;
            }
            System.out.printf("%d! = %d%n", num, result);
            System.out.println("Would you like to continue? (Y/N)");
            choice = in.next();
            if (!choice.equalsIgnoreCase("Y")){
                break;
            }
        }
    }
}