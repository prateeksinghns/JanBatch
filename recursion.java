public class recursion {

    static void rec(int i)
    {
        if( i == -1)
        {
            return;
        }

        System.out.println(i);

        rec(i-1);
    }

    //5 = 1 x 2 x 3 x 4 x 5
    //Eg. 5! = 120

    static int fact(int n)
    {
        if(n == 1) return 1;
        return n*fact(n-1);
    }

    /**
     * Print fibonacci series till nth term
     * 0 1 1 2 3 5 ..
     * 
     */

    static int fib(int n)
    {
        if (n==0) return 0;
        if(n==1 || n == 2) return 1;
        return fib(n-1) + fib(n-2);
    }

    static boolean powOfFour(int n)
    {
        if(n<1) return false;
        if(n==1) return true;

        if(n%4!=0) return false;

        return powOfFour(n/4);
    }
    public static void main(String[] args) {
        System.out.println(powOfFour(16));
    }
}
