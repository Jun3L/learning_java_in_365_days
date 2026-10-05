import java.util.Scanner;

public class day73 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] notes = new String[100];
        int noteCount = 0;
        int choice;
        do {
            System.out.println("==== Note Taking App ====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("3. Delete Note");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = s.nextInt();
            s.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter note: ");
                    notes[noteCount++] = s.nextLine();// Add note and increment count
                    System.out.println("Note added.");
                    break;
                case 2:
                    System.out.println("Notes:");
                    for (int i = 0; i < noteCount; i++) {// Loop through notes and print them
                        System.out.println((i + 1) + ". " + notes[i]);
                    }
                    break;
                case 3:
                    System.out.print("Enter note number to delete: ");
                    int index = s.nextInt() - 1;// Convert to 0-based index
                    if (index >= 0 && index < noteCount) {// Check if index is valid
                        for (int i = index; i < noteCount - 1; i++) {
                            notes[i] = notes[i + 1];
                        }
                        noteCount--;// Decrement note count
                        System.out.println("Note deleted.");
                    } else {
                        System.out.println("Invalid note number.");
                    }
                    break;
                case 4:
                    System.exit(0);// Exit the program
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 4);
        s.close();
    }
}
