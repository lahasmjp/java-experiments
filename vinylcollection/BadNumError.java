public class BadNumError extends Exception {
    public BadNumError () {
        System.out.println("Invalid input: Please input numbers 1, 2 or 3.");
    }
}