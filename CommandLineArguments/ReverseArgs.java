public class ReverseArgs {
    public static void main(String[] args) {
        // Check if command-line arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
            return;
        }
        
        // Print command-line arguments in reverse order
        System.out.println("Command-line arguments in reverse order:");
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.print(args[i]+" ");
        }
    }
}
