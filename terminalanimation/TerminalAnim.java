import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
public class TerminalAnim {
    static Scanner input = new Scanner(System.in);
    static Random rand = new Random();
    public static String submitter() {
        String s = input.nextLine();
        return s;
    }
    public static void printString(String s) {
        for (int i = 0; i < s.length(); i++) {
            System.out.print(s.charAt(i));
            try 
            {
                if (s.charAt(i) == (' ')) {
                    TimeUnit.MILLISECONDS.sleep(100);
                } else {
                    TimeUnit.MILLISECONDS.sleep((15 + rand.nextInt(100))/2);
                }
            } catch (InterruptedException e) {
                System.out.println("Interrupted Error");
            }
        }
    }
    public static void main(String[] args) {
        String s;
        System.out.println("Input text to see it animated.... (Type done1 to exit program)");
        s = submitter();
        while (!(s.equalsIgnoreCase("done1"))) {
            printString(s);
            System.out.println("\nInput text to see it animated.... (Type done1 to exit program)");
            s = submitter();
        }
        input.close();
    }
}