class Wrapper {
    public static void main(String[] args) {
        char ch = 'a';
 
        // Check if the character is a letter
        if (Character.isLetter(ch)) {
            System.out.println(ch + " is a letter.");
        }
 
        // Convert to uppercase
        char upperCh = Character.toUpperCase(ch);
        System.out.println("Uppercase: " + upperCh);
 
        // Check if it's a digit
        char num = '5';
        if (Character.isDigit(num)) {
            System.out.println(num + " is a digit.");
        }
 
        // Check for whitespace
        char space = ' ';
        if (Character.isWhitespace(space)) {
            System.out.println("The character is a whitespace.");
        }
 
        // Using toString()
        String charStr = Character.toString(ch);
        System.out.println("String representation: " + charStr);
    }
}