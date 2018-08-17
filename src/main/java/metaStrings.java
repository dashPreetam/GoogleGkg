import java.util.Scanner;

public class metaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string : ");
        String firstString = scanner.nextLine();
        System.out.print("Enter second string : ");
        String secondString = scanner.nextLine();
        System.out.println("Strings can be matched :" + canMatch(firstString,secondString));
    }
    public static boolean canMatch(String firstString,String secondString){
        int length=firstString.length();
        if(length!=secondString.length())
            return false;
        int count = 0;
        int firstPosition=0,secondPosition=0;
        for(int lengthLoop = 0; lengthLoop < length; lengthLoop++)
        {
            if(firstString.charAt(lengthLoop)!=secondString.charAt(lengthLoop))
            {
                count++;
                if(count>2)
                    return false;
                firstPosition = secondPosition;
                secondPosition = lengthLoop;
            }
        }
        if(firstString.charAt(firstPosition)==secondString.charAt(secondPosition)&&firstString.charAt(secondPosition)==secondString.charAt(firstPosition))
            return true;
        else
            return false;
    }
}
