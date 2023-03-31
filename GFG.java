import java.io.*;
 
class GFG {
     

    static int sumOfDigitsFrom1ToN(int n)
    {
        int result = 0; 
        for (int x = 1; x <= n; x++)
            result += sumOfDigits(x);
      
        return result;
    }
      
    static int sumOfDigits(int x)
    {
        int sum = 0;
        while (x != 0)
        {
            sum += x % 10;
            x   = x / 10;
        }
        return sum;
    }
     
    public static void main(String args[])
    {
        int n = 328;
        System.out.println("Sum of digits in numbers"
                          +" from 1 to " + n + " is "
                          + sumOfDigitsFrom1ToN(n));
    }
}