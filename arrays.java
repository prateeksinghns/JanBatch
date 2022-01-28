public class arrays {
    public static void main(String[] args) {
        int ar[] = new int[5];//Declaration of an array
        ar[0] = 5;//Storing of values in an array
        ar[1] = 8;
        ar[2] = 6;
        ar[3] = 7;
        ar[4] = 9;

        int ar2[] = {5,6,8,9,10};

        for(int i = 0;i<5;i++)
        {
            System.out.println(ar[i]);//Access the value of an array at an index
        }

        //Declare an array and for a given n
        //0 1 3 6 10..
        //0 -> n-1
        //0 1 3 6.... -> store this in array and print the sum of it
        int n = 10;
        int arr[] = new int[n];

        for(int i = 1;i<n;i++)
        {
            arr[i] = arr[i-1] + i;
        }

        for(int val: arr) //For each loop
        {
            // System.out.println(val);
        }

        //List of values
        //Can we store an array at each index of an array? (Can I store a list within each position of a list)
        //2D array -> m x n matrix

        int twoDAr[][] = new int[3][3];

        twoDAr[1][1] = 2;
        twoDAr[0][0] = 1;
        twoDAr[2][2] = 3;


        for(int i = 0;i<3;i++)
        {
            for(int j = 0;j<3;j++)
            {
                System.out.print(twoDAr[i][j] + " ");
            }
            System.out.println();
        }

        for(int j = 0;j<3;j++)
        {
            int sum = 0;
            for(int i = 0;i<3;i++)
            {
                sum += twoDAr[i][j];
            }
            System.out.print(sum + " ");
        }

        System.out.println("\nJagged Array ------>");
        //Jagged array
        int jaggedAr[][] = new int[3][];
        for(int i = 0;i<3;i++)
        {
            jaggedAr[i] = new int[i+1];
        }

        for(int row[]: jaggedAr)
        {
            for(int col: row)
            {
                System.out.print(col + " ");
            }
            System.out.println();
        }

        //Find the second maximum element in an array
        //[5,3,7,1,8,9,10] -> 9

        System.out.println("Second Maximum Element");
        
        int solve[] = {5,3,7,1,8,9,10};

        int max = 0;
        for(int i = 0;i<solve.length;i++)
        {
            if(max < solve[i]) max = solve[i];
        }

        int secondMax = 0;

        for(int i = 0;i<solve.length;i++)
        {
            if(secondMax < solve[i] && solve[i] != max) secondMax = solve[i];
        }

        System.out.println(secondMax);
    }
}
