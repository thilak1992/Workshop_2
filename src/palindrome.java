import java.util.Scanner;

public class palindrome {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String Input");
        String input = scanner.nextLine();

         if(isPalindrome(input))         // checking is palindrome or not
        {
          System.out.println(input+ " is Palindrome String");
        }
        else
        {
            System.out.println(input+ " is not a Palindrome String");
        }

    }



    public static boolean isPalindrome(String str) {
        int left = 0, right = str.length() - 1;

        while(left < right)
        {
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}


