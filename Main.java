import java.util.Scanner;
public class Main {
    public static boolean isPalindrome(String str){
        //remove space & change all to lower case
        str = str.replaceAll("\\s","").toLowerCase();
        if (str.length() <= 1){
            return true;
        }
        //check if 1st & last char is the same
        if (str.charAt(0) != str.charAt(str.length() - 1)){
            return false;
        }
        return isPalindrome(str.substring(1, str.length() - 1));
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a palindrome string :");
        String input = scanner.nextLine();

        if (isPalindrome(input)){
            System.out.println("Yup," + input + " is a palindrome.");
        } else {
            System.out.println("Nah," + input + " is not a palindrome bro.");
        }
        scanner.close();
    }
}