public class GroceryItem {
    private String category;
    private String name;
    private int amount;

    public GroceryItem(String category, String name, int amount) {
        this.category = category;
        this.name = name;
        this.amount = amount;
    }
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
