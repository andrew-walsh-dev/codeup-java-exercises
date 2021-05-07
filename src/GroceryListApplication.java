import java.util.*;

public class GroceryListApplication {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String itemCategory;
        String itemName;
        int itemAmount;
        final String[] CATEGORIES = {
            "fruit", 
            "vegetable", 
            "canned", 
            "frozen", 
            "meat", 
            "fish",
            "sauce",
            "beverage",
            "baking",
            "household",
            "snacks",
            "personal",
            "health"
        };
        Arrays.sort(CATEGORIES);

        ArrayList<GroceryItem> groceryList = new ArrayList<GroceryItem>();
        System.out.println("Would you like to create a grocery list? (Y/N)");
        boolean makeList = (in.next().equalsIgnoreCase("Y"));
        if (makeList){
            boolean adding = true;
            while (adding){
                for (String category : CATEGORIES){
                    System.out.println(category);
                }
                System.out.println("Choose one of these catgories for the item^");
                itemCategory = in.next();
                in.nextLine();
                System.out.println("Enter a name for this item: ");
                itemName = in.nextLine();
                System.out.println("Enter the amount of this item: ");
                itemAmount = in.nextInt();
                groceryList.add(new GroceryItem(itemCategory, itemName, itemAmount));
                System.out.println("Would you like to add more items? (Y/N)");
                adding = (in.next().equalsIgnoreCase("Y"));
            }
            System.out.println("Here is your list:");
            System.out.printf("%10s %10s %10s%n", "category", "name", "amount");
            for (String category : CATEGORIES){
                for (GroceryItem item : groceryList){
                    if (item.getCategory().equals(category)){
                        System.out.printf("%10s %10s %10d%n", item.getCategory(), item.getName(), item.getAmount());
                    }
                }
            }
        }
    }
}
