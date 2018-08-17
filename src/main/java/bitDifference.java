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
