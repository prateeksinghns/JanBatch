import java.util.Scanner;//Small code/software that helps you take input
public class DayTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);//Object of scanner class
        //Output
        System.out.println("Input the value of a in next line");
        //Take different kinds of inputs

        int a = input.nextInt();
        // float f = input.nextFloat();
        // double db = input.nextDouble();
        // String s = input.nextLine();

        System.out.println("The value of a is " + a);

        //Conditional statements
        if(a < 10)
        {
           System.out.println("10 is greater than a"); 
        }
        else if(a == 10)//is a equal to 10? Checks if LHS and RHS are equal
        {
            System.out.println("A is equal to 10");
        }
        else
        {
          System.out.println("10 is lesser than a"); 
        }

        //Switch Case statement
        System.out.println("Input the value of b in next line");
        int b = input.nextInt();
        switch(b)
        {
            case 10: System.out.println("10");
            break;
            case 20: System.out.println("20");
            break;
            default: System.out.println("Unknown number");
        }

        //Ternary Operator
        //Shorthand notation for if else
        String st = (a > 10) ? "Happy" : "Sad";

        //Above ternary operator is same as below if else
        String res;
        if(a>10)
        {
            res = "Happy";
        }
        else
        {
            res = "Sad";
        }

        System.out.println(st);
    }
}
