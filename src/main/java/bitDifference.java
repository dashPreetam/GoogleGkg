/*
Input: arr[] = {1, 2}
Output: 4
All pairs in array are (1, 1), (1, 2)
                       (2, 1), (2, 2)
Sum of bit differences = 0 + 2 +
                         2 + 0
                      = 4

Input:  arr[] = {1, 3, 5}
Output: 8
All pairs in array are (1, 1), (1, 3), (1, 5)
                       (3, 1), (3, 3) (3, 5),
                       (5, 1), (5, 3), (5, 5)
Sum of bit differences =  0 + 1 + 1 +
                          1 + 0 + 2 +
                          1 + 2 + 0
                       = 8
 */

import java.util.Scanner;

public class bitDifference {
    static int array[];
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Number of elements : ");
        int size= scanner.nextInt();
        array=new int[size];
        int loop;
        for(loop=0;loop<size;loop++){
            array[loop]=scanner.nextInt();
        }
        System.out.println("Sum of Bit Difference : "+sumBitDiff());
    }
    public static int sumBitDiff(){
        int sum=0;
        int bitLoop,sizeLoop;
        int count =0;
        for (bitLoop = 0; bitLoop < 32; bitLoop++) {
            count = 0;
            for (sizeLoop = 0; sizeLoop < array.length; sizeLoop++) {
                if((array[sizeLoop] & 1<<bitLoop) == 0)
                    count++;
            }
            sum+=count*(array.length-count)*2;
        }
        return sum;
    }
}
