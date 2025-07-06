public class Query {
    static String addBookInDB =  "INSERT INTO books (title, author) VALUES (?, ?)";
    static String viewBookInDB = "SELECT * FROM books";
    static String updateBookInDB = "UPDATE books SET title = ?, author = ? WHERE id = ?";
    static String deleteBookInDB = "DELETE FROM books WHERE id = ?";
}
