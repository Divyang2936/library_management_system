import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Book book = new Book();
        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("Menu for library");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Update Book");
            System.out.println("4. Delete Book");
            System.out.println("5. Exit");

            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    book.addBook();
                    break;
                case 2:
                    book.viewBook();
                    break;
                case 3:
                    book.updateBook();
                    break;
                case 4:
                    book.deleteBook();
                    break;
                case 5:
                    System.out.println("Exiting....");
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
            
        }
    }
}
