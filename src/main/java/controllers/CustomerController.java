package controllers;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CustomerController {

    //Create a table for the class above if and only
    //if it doesn't already exist.

    static Connection connection = Database.DbConn();
    static PreparedStatement ps;
    static ResultSet rs;
    static Scanner scanner = new Scanner(System.in);

    public static boolean createCustomerTable() {
        try {
            ps = connection.prepareStatement(
                    "CREATE TABLE IF NOT EXISTS customer(" +
                            "id serial," +
                            "first_name varchar(255)," +
                            " last_name varchar(255)," +
                            "email varchar(255)," +
                            "PRIMARY KEY(id))");
            ps.execute();
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

    }

    public static void getAllCustomers(){



        try{
            ps = connection.prepareStatement("SELECT * FROM customer");
            rs = ps.executeQuery();

            //Loop through the result set
            while (rs.next()) {
                String id = "id: " + rs.getInt("id");
                String firstName = "first_name: " + rs.getString("first_name");
                String lastName = "last_name: " + rs.getString("last_name");
                String email = "email: " + rs.getString("email");

                System.out.println(id + ", " + firstName + ", " + lastName + ", " + email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static boolean createNewCustomer() {
        // Add prompts to tell the user what data they need to enter next
        System.out.print("Enter the customer first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the customer  last_name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the email: ");
        String email = scanner.nextLine();




        try {
            ps = connection.prepareStatement("INSERT INTO customer(first_name, last_name, email) " +
                    "VALUES('" + firstName + "','" + lastName + "', '" + email + "')");

            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean updateCustomer() {
        // Update prompts to tell the user what data they need to enter next

        System.out.println("Possible fields to update: first_name, last_name, email");
        System.out.print("Enter the field name: ");
        String fieldName = scanner.nextLine();

        System.out.print("Enter the value of the field: ");
        String fieldValue = scanner.nextLine();


        System.out.print("Enter the customer's id : ");
        int id = scanner.nextInt();

    if(!fieldName.equals(("first_name")) || !fieldName.equals(("last_name")) || !fieldName.equals(("email"))) {
            System.out.println("Invalid field name");
            updateCustomer();
        }


        try {
            ps = connection.prepareStatement("UPDATE customer SET " +
                    fieldName + " = '" + fieldValue + "', " +
                    "WHERE id = " + id);

            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public static boolean deleteCustomer() {
        // Update prompts to tell the user what data they need to enter next


        System.out.print("Enter the id you want to delete: ");
        int id = scanner.nextInt();


        try {
            ps = connection.prepareStatement("DELETE FROM sales WHERE customer_id = " + id);
            ps.execute();

            ps = connection.prepareStatement("DELETE FROM customer WHERE id = " + id);

            ps.execute();

            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

}