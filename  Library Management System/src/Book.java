import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class Book {
    Connection conn = DB.connect();
    Scanner sc = new Scanner(System.in);
    public void addBook(){
        try {
            System.out.print("Enter Book Title : ");
            String title = sc.nextLine();

            System.out.print("Enter Author Name");
            String author = sc.nextLine();

            PreparedStatement prstm = conn.prepareStatement(Query.addBookInDB);

            prstm.setString(1, title);
            prstm.setString(2, author);

            int rows = prstm.executeUpdate();
            if (rows > 0) {
                System.out.println("Book added successfully.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void viewBook(){
        try {
            PreparedStatement prstm = conn.prepareStatement(Query.viewBookInDB);
            ResultSet rs = prstm.executeQuery();

            while (rs.next()) {
                System.out.println("Id : " + rs.getInt("id") + " Book " + rs.getString("title") + " Author : " + rs.getString("author"));
            }
        } catch(Exception e ) {
            e.printStackTrace();
        }
    }
    public void updateBook(){
        try {
            System.out.print("Enter Book Id For Update : ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter New Title  : ");
            String title = sc.nextLine();

            System.out.print("Enter New Author  : ");
            String author = sc.nextLine();

            PreparedStatement prstm = conn.prepareStatement(Query.updateBookInDB);

            prstm.setString(1, title);
            prstm.setString(2, author);
            prstm.setInt(3, id);

            int rows = prstm.executeUpdate();
            if (rows > 0) {
                System.out.println("Book updated successfully.");
            } else {
                System.out.println("Book not found.");
            }


        } catch(Exception e) {
            e.printStackTrace();
        }
        
    }
    public void deleteBook(){
        try {
            System.out.print("Enter Book Id For Update : ");
            int id = sc.nextInt();

            PreparedStatement prstm = conn.prepareStatement(Query.deleteBookInDB);
            prstm.setInt(1, id);

            int rows = prstm.executeUpdate();
            if (rows > 0) {
                System.out.println("Book deleted successfully.");
            } else {
                System.out.println("Book not found.");
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}
