import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {
        Main program = new Main();
        program.connectionOpen();
        program.insert();
        program.connectionClose();
    }
    Connection co;
    void connectionOpen(){
        try{
            Class.forName("org.sqlite.JDBC");
            co = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\book.db");
            System.out.println("База данных подключена успешно.");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void insert() throws SQLException {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите название книги:");
            String name = sc.nextLine();
            System.out.println("Введите имя автора:");
            String author = sc.nextLine();

            String query = "INSERT INTO books (name, author) " + "VALUES ('" + name + "', '" + author + "') ";
            Statement statement = co.createStatement();
            statement.executeUpdate(query);
            System.out.println("Запись добавлена");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    void connectionClose() throws SQLException {
        co.close();
    }
}