public class Palindrome {
    public static void main(String[] args) {
        // Check if a single command-line argument is provided
        if (args.length != 1) {
            System.out.println("Please provide a single string as a command-line argument.");
            return;
        }
        
        String input = args[0];
        
        // Check if the input string is a palindrome
        if (isPalindrome(input)) {
            System.out.println("The input string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The input string \"" + input + "\" is not a palindrome.");
        }
    }
    
    public static boolean isPalindrome(String str) {
        int length = str.length();
        
        // Compare characters from the start and end of the string
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - 1 - i)) {
                return false; // If characters don't match, it's not a palindrome
            }
        }
        
        return true; // If loop completes, it's a palindrome
    }
}
