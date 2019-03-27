package day09;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MySqlCommandLine {

    private static final String URL = "jdbc:mysql:///?user=root&password=shiyao&useSSL=false";
    private static SimpleDateFormat SimpleDateFormat;
    private Connection connection;
    private static Scanner scanner;

    public MySqlCommandLine() {
        scanner = new Scanner(System.in);
        getConnection();
        SimpleDateFormat = new SimpleDateFormat("[YYYY-MM-dd HH:mm:ss]");
    }

    public Connection getConnection() { //防止创建多个链接
        if (connection == null) {
            try {
                new Driver();
                connection = DriverManager.getConnection(URL);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void update(String sql) {
        try {
            PreparedStatement preparedStatement;
            long start = System.currentTimeMillis();
            preparedStatement = connection.prepareStatement(sql);
            int rowAffected = preparedStatement.executeUpdate();
            long end = System.currentTimeMillis();
            System.out.println(SimpleDateFormat.format(new Date(end)));
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void query(String sql) {
        System.out.println("query: " + sql);
    }

    public void dispatch(String sql) {
        if (sql.toLowerCase().trim().startsWith("select")) {
            query(sql);
        } else {
            update(sql);
        }
    }

    public String getSQL() {
        System.out.println("input SQL statement:");
        String sql = scanner.nextLine();
        return sql;
    }

    public static void main(String[] args) {
        MySqlCommandLine mySqlCommandLine = new MySqlCommandLine();
        String sql = mySqlCommandLine.getSQL();
        mySqlCommandLine.dispatch(sql);
    }

}
