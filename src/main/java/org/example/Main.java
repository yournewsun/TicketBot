package org.example;


import org.example.controller.PostgreSQLConnectionLocalhost;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection = PostgreSQLConnectionLocalhost.getConnection();

        // Використовуйте з'єднання для виконання запитів та роботи з базою даних
        // ...

        try {
            connection.close();
            System.out.println("Disconnected from the database.");
        } catch (SQLException e) {
            System.out.println("Failed to close the database connection.");
            e.printStackTrace();
        }

    }
}