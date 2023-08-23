package Assignment2;
import java.util.Scanner;

public class Assn2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);

            int ch = 0;
            while (ch != 4) {
                System.out.println("\nChoose a plugin to execute:");
                System.out.println("1. Text Plugin");
                System.out.println("2. Image Plugin");
                System.out.println("3. Audio Plugin");
                System.out.println("4. Exit");
                System.out.print("Enter your choice: ");

                ch = sc.nextInt();
                Plugin plugin = null;

                switch (ch) {
                    case 1:
                        plugin = new TextPlugin();
                        break;
                    case 2:
                        plugin = new ImagePlugin();
                        break;
                    case 3:
                        plugin = new AudioPlugin();
                        break;
                    case 4:
                        System.out.println("Exiting...");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }

                if (plugin != null) {
                    plugin.execute();
                }

            }
            sc.close();
        } catch (Exception e) {
            System.out.println("Something went wrong!: " + e.getMessage());
        }

    }
}


interface Plugin {
    void execute();
}

class TextPlugin implements Plugin {
    @Override
    public void execute() {
        System.out.println("Activating TextPlugin...");
    }
}

class ImagePlugin implements Plugin {
    @Override
    public void execute() {
        System.out.println("Activating ImagePlugin...");
    }
}

class AudioPlugin implements Plugin {
    @Override
    public void execute() {
        System.out.println("Activating AudioPlugin...");
    }
}