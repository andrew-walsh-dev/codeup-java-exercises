public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"evil", "fair", "fancy", "cool", "crazy", "funny", "silly", "wild", "tiny", "booming"};
        String[] nouns = {"actor", "gold", "grass", "planet", "pizza", "army", "apple", "dog", "sound", "bug"};  
        String serverName = getRandomString(adjectives) + "-" + getRandomString(nouns);
        System.out.println("Here is your server's name: " + serverName);  
    }
    public static String getRandomString(String[] strings){
        int index = (int) Math.floor(Math.random() * strings.length);
        return strings[index];
    }
}
