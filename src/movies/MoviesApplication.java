package movies;
import java.util.Scanner;
public class MoviesApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input;
        Movie[] movies = MoviesArray.findAll();
        while (true){
            System.out.println("\nWhat would you like to do?");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println();
            System.out.println("Enter your choice: ");
            input = in.nextInt();
            System.out.println();
            if (input == 0){
                break;
            }
            else if (input == 1){
                for (Movie movie : movies){
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            }
            else if (input == 2){
                for (Movie movie : movies){
                    if (movie.getCategory() == "animated"){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }
            else if (input == 3){
                for (Movie movie : movies){
                    if (movie.getCategory() == "drama"){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }
            else if (input == 4){
                for (Movie movie : movies){
                    if (movie.getCategory() == "horror"){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }
            else if (input == 5){
                for (Movie movie : movies){
                    if (movie.getCategory() == "scifi"){
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }
        }
    }
}
