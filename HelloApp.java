public class HelloApp {
    public static void main(String[] args) {

        // Check if at least one argument is provided
        if (args.length > 0) {
            String name = args[0];  // Read first argument
            System.out.println("Hello, " + name + "!");
        } else {
            // Default message if no argument is given
            System.out.println("Hello, World!");
        }
    }
}