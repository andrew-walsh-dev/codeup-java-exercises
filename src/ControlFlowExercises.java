import java.util.Scanner;
public class ControlFlowExercises {
     public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        //1a
        {
            int i = 5;
            while (i <= 15){
                System.out.println(i++);
            }
        }
        //1b
        {
            int i = 2;
            do {
                System.out.println(i);
                i = (int) Math.pow(i, 2);
            } while(i <= 1000000);
        }
        //1c
        {
            for (int i = 5; i <= 15; i++){
                System.out.println(i);
            }

            for (int i = 2; i < 1000000; i = (int) Math.pow(i, 2)){
                System.out.println(i);
            }
        }
        // //2
        // {
        //     for (int i = 1; i <= 100; i++){
        //         if (i % 5 == 0 && i % 3 == 0){
        //             System.out.println("FizzBuzz");
        //         }
        //         else if (i % 3 == 0){
        //             System.out.println("Fizz");
        //         }
        //         else if (i % 5 == 0){
        //             System.out.println("Buzz");
        //         }
        //         else{
        //             System.out.println(i);
        //         }
        //     }
        // }
        // //3
        // {
        //     do{
        //         System.out.println("What number would you like to go up to? ");
        //         int upTo = in.nextInt();
        //         System.out.println("Here is your table: \n");
        //         System.out.printf("%7s | %7s | %5s%n", "number", "squared", "cubed");
        //         System.out.printf("%7s | %7s | %5s%n", "------", "-------", "-----");
        //         for (int i = 1; i <= upTo; i++){
        //             System.out.printf("%7d | %7d | %5d%n", i, (int) Math.pow(i, 2), (int) Math.pow(i, 3));
        //         }
        //     } while(false);
        // }
     }
}
