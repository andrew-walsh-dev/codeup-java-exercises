package util;

public class InputTest {
    public static void main(String[] args) {
        Input myScanner = new Input();
        System.out.println(myScanner.getString()); 
        System.out.println(myScanner.yesNo());
        System.out.println(myScanner.getInt());
        System.out.println(myScanner.getInt(1,100));
        System.out.println(myScanner.getDouble());
        System.out.println(myScanner.getDouble(1,100));
    }
}
