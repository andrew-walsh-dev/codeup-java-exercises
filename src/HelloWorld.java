public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        {
            int myFavoriteNumber = 5;
            String myString = "I am a string.";
            float myNumber = 3.14F;
            System.out.println(myNumber);
        }
        {
            int x = 5;
            System.out.println(x++);
            System.out.println(x);
        }
        {
            int x = 5;
            System.out.println(++x);
            System.out.println(x);
        }
        {
            int x = 4;
            x += 5;
        }
        {
            int x = 3;
            int y = 4;
            y *= x;
        }
        {
            int x = 10;
            int y = 2;
            x /= y;
            y -= x;
        }
        {
            //overflow
            int x = Integer.MAX_VALUE + 1;
            System.out.println(x);
        }
    }
}

