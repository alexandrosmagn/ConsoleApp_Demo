import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ConsoleApp app = new ConsoleApp();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            String[] parts = input.split(" ");
            String command = parts[0];
            if (command.equals("exit")) {
                break;
            } else if (command.equals("add")) {
                app.addContact(parts[1], parts[2]);
            } else if (command.equals("get")) {
                System.out.println(app.getName(parts[1]).orElse("Contact not found"));
            } else if (command.equals("delete")) {
                app.deleteContact(parts[1]);
            } else if (command.equals("list")) {
                app.list();
            }
        }
    }

}
