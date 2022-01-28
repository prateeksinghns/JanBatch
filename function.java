import java.util.Scanner;
public class function {
    static int magic(int n)
    {
        return n + 1;
    }
    //Write a function to multiply two values
    static int multiply(int x, int y)
    {
        return x * y;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter number of sides");
        int b = s.nextInt();
        int c = magic(b);
        System.out.println(multiply(5, 10));
    }
}
