/*
Input:  x = 2, y = 3, p = 5
Output: 3
Explanation: 2^3 % 5 = 8 % 5 = 3.

Input:  x = 2, y = 5, p = 13
Output: 6
Explanation: 2^5 % 13 = 32 % 13 = 6.
*/

import java.util.Scanner;

public class modExpo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        System.out.println("Result for (x^n)%m = "+mod(x,n,m));
    }
    static int mod(int x, int n, int m)
    {
        if(n==0)
            return 1;
        else if(n%2==0)
        {
            int z = mod(x,n/2,m);
            return (z*z)%m;
        }
        else
            return (x%m * mod(x,n-1,m))%m;
    }
}
