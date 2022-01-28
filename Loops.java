// public class Loops {
//     public static void main(String[] args) {
//         //Loop only till i is less than 10
//         //i++ means i = i + 1 | increment i by 1
//         //i-- means i = i - 1 | decrement i by 1
//         //0 1 2 3 4 5 6 7 8 9
//         //9 8 7 6 5 4 3 2 1 0
//         //0 2 4 6 8
//         //for, for each, while, do while
//         for(int i = 0; i<10; i++)
//         {
//             System.out.println(i);
//         }

//         for(int i = 9; i>=0 ; i--)
//         {
//             System.out.println(i);
//         }

//         //while
//         int i = 0;//iterator
//         while(i<10)
//         {
//             System.out.println(i);
//             i++;
//         }

//         //Print 0 2 4 6 8
//         // i+=2 -> i = i + 2
//         // i-=2 -> i = i- 2
//         // i *= 2 -> i = i * 2
//         // i /= 2 -> i = i/2
//         for(int i = 0; i < 10; i += 2)
//         {
//             System.out.println(i);
//         }

//         int i = 0;
//         while(i<10)
//         {
//             System.out.println(i);
//             i += 2;
//         }
//         //2 4 8 16 32
//         //2^1 2^2 2^3 2^4 2^5
//         for(int i = 2;i<=32;i *= 2)
//         {
//             System.out.println(i);
//         }

//         //Do while loop
//         int i = 2;
//         do {
//             System.out.println(i);
//             i*=2;
//         } while (i<=32);

//         int a = 0;
//         int b = 0;
//         int x = a++;//Post increment operator

//         int y = ++b;//Pre increment operator

//         System.out.println("X is " + x);
//         System.out.println("Y is " + y);

//         //Modulo operator -> % (remainder operator)
//         System.out.println(5%2);//If you divide 5 by 2 then 5%2 will give remainder of this division

//         //Logical operators

//         // and -> &&
//         // or -> ||
//         // not -> !


//         //St a , St b
//         if(10>5 && 10>6)
//         {
//             System.out.println("10 is greater");
//         }

//         if(10>5 || 10>11)
//         {
//             System.out.println("10 is greater than one of them");
//         }

//         if(! (10<5) )
//         {
//             System.out.println("10 is not less than 5");
//         }
//     }
// }
