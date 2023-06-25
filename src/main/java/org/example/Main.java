package org.example;


import org.example.controller.PostgresSQLConnectionLocalhost;
import org.example.model.Customer;
import org.example.model.Ticket;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        Customer customer = new Customer();





        /*
        Connection connection = PostgresSQLConnectionLocalhost.getConnection();

        // Використовуйте з'єднання для виконання запитів та роботи з базою даних
        // ...

        try {
            connection.close();
            System.out.println("Disconnected from the database.");
        } catch (SQLException e) {
            System.out.println("Failed to close the database connection.");
            e.printStackTrace();
        }

         */

    }
}