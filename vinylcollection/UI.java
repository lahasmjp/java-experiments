import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UI extends BadNumError {
    public File directory;

    public void main(String[] args) throws BadNumError {
        initCatalog(directory);
        menu();
    }

    public static Record[] initCatalog(File f){
        Record[] catalog = {new Record("Born Like This", "MF DOOM", 2003, 1, 10.00)};
        return catalog;
    }

    public static void menu() throws BadNumError {
        try {
            Scanner input = new Scanner(System.in);
            System.out.println("====* Vinyl Collection *====");
            System.out.println("(1) See Records");
            System.out.println("(2) Add Records");
            System.out.println("(3) Delete Records");
            System.out.println("(4) Settings");
            switch (selector(input.nextInt())) {
                case 1: {
                    see();
                }
                case 2: {
                    add();
                }
                case 3: {
                    delete();
                }
                case 4: {
                    settings();
                }
            }
            input.close();
        } catch (InputMismatchException badin) {
            System.out.println("Invalid input: Please input numbers 1, 2 or 3.");
            menu();
        }
    }

    public static void settings() {

    }

    public static int selector(int num) throws BadNumError {
        switch (num) {
            case 1: {
                return 1;
            }
            case 2: {
                return 2;
            }
            case 3: {
                return 3;
            }
            case 4: {
                return 4;
            }
            default: {
                throw new BadNumError();
            }
        }
    }

    public static void see() {

    }

    public static void add() {
    }

    public static void delete() {

    }
}
