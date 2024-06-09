package homework_nr_22;

import java.sql.*;
import java.util.Scanner;

public class Main {
    private static final String INSERT_ALL_INTO_STUDENTS_INFO = "insert into students(name, age, ismale, grade) " +
            "values (?, ?, ?, ?)";
    private static final String INSERT_GRADE_INTO_STUDENTS_INFO  = "UPDATE students SET grade=? WHERE id=?";

    private static final String DELETE_STUDENT_INTO_STUDENTS_INFO  = "DELETE FROM students WHERE id=?";

    public static void main(String[] args) throws SQLException {
        String connectionString = "jdbc:postgresql://localhost:5432/alina_bogutcaia";
        String user = "postgres";
        String password = "5432";
        Connection con = DriverManager.getConnection(connectionString, user, password);

        PreparedStatement preparedStatement = con.prepareStatement(INSERT_ALL_INTO_STUDENTS_INFO);
        System.out.println("Write name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Write age:");
        int age = in.nextInt();
        System.out.println("Write isMale:");
        boolean isMale = in.nextBoolean();
        System.out.println("Write grade:");
        int grade = in.nextInt();
        preparedStatement.setString(1, name);
        preparedStatement.setInt(2, age);
        preparedStatement.setBoolean(3, isMale);
        preparedStatement.setInt(4, grade);

        preparedStatement.executeUpdate();

        PreparedStatement preparedStatement1 = con.prepareStatement(INSERT_GRADE_INTO_STUDENTS_INFO);
        System.out.println("Write id of students:");
        int id = in.nextInt();
        System.out.println("Write grade of students:");
        int grade2 = in.nextInt();
        preparedStatement1.setInt(1, grade2);
        preparedStatement1.setInt(2, id);
        preparedStatement1.executeUpdate();

        PreparedStatement preparedStatement2 = con.prepareStatement(DELETE_STUDENT_INTO_STUDENTS_INFO);
        System.out.println("Delete student with id:");
        int id2 = in.nextInt();
        preparedStatement2.setInt(1, id2);
        preparedStatement2.executeUpdate();

        Statement stmt = con.createStatement();
        ResultSet result1 = stmt.executeQuery("SELECT * FROM students");
        while(result1.next()){
           System.out.println("NAME: " + result1.getString("name") +
                   " AGE: " + result1.getInt("age") +
                   " ISMALE: " + result1.getBoolean("isMale") +
                   " GRADE: " + result1.getInt("grade"));
       }
        con.close();


    }
}
