public class HelloApp {
    public static void main(String[] args) {
        System.out.print("Hello ");
        
        if (args.length == 0) {
            System.out.print("World");
        } else {
            System.out.print(String.join(", ", args));
        }
    }
}