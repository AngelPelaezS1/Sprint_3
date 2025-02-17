package Level1;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Undo undo = Undo.getInstance();

        int option = 0;
        do {
            mostrarMenu();
            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Enter the command to add");
                    String command = sc.nextLine();
                    undo.addCommands(command);
                    break;
                case 2:
                    undo.removeLastCommand();
                    break;
                case 3:
                    undo.listCommands();
                    break;
                case 4:
                    System.out.println("GoodBye");
                    break;
                default:
                    System.out.println("Invalid input enter a number between 1 and 4");
                    break;
            }
            System.out.println();
        } while (option != 4);
    }
    public static void mostrarMenu(){
        System.out.println("**Loading menu**");
        System.out.println("1.Add commands");
        System.out.println("2.Remove last command");
        System.out.println("3.Lists commands");
        System.out.println("4.Exit the program");
        System.out.println("Choose an option");
    }
}
