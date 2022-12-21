package controllers;

import db.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Sales {

        static Connection connection = Database.DbConn();
        static PreparedStatement ps;
        static ResultSet rs;
        static Scanner scanner = new Scanner(System.in);

        public static boolean createSalesTable() {
            try {
                ps = connection.prepareStatement(
                        "CREATE TABLE IF NOT EXISTS sales(" +
                                "id serial PRIMARY KEY," +
                                "customer_id int," +
                                "date_purchased TIMESTAMP," +
                                "total float," +
                                "FOREIGN KEY(customer_id) REFERENCES customer(id))");
                ps.execute();
                return true;
            } catch (SQLException e) {
                e.printStackTrace();
                return false;
            }

        }

        public static void getAllSales(){



            try{
                ps = connection.prepareStatement("SELECT * FROM sales");
                rs = ps.executeQuery();

                //Loop through the result set
                while (rs.next()) {
                    String id = "id: " + rs.getInt("id");
                    String customerId = "customer_id: " + rs.getInt("customer_id");
                    String datePurchased = "date_purchased: " + rs.getTimestamp("date_purchased");
                    String Total = "total: " + rs.getFloat("total");

                    System.out.println(id + ", " + customerId + ", " + datePurchased + ", " + Total);
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public static Map<Integer,Float> handleItemTotal(){
            System.out.println("Enter how many items were bought: ");
            int numberOfItems = scanner.nextInt();

            Map<Integer, Float> items = new HashMap<>();
            float itemTotal = 0;

            for (int i = 0; i < numberOfItems; i++){
                // Use the connection to get the item by id after you
                // pass it into the map
                System.out.println("Enter the item id: ");
                int itemId = scanner.nextInt();

                System.out.println("Enter the quantity purchased: ");
                int qty = scanner.nextInt();
                float itemPrice = 0;
                try{
                    ps = connection.prepareStatement("SELECT price FROM items WHERE id = " + itemId);
                    rs = ps.executeQuery();
                    while(rs.next()){
                        itemPrice = rs.getFloat("price");
                    }

                    itemTotal = itemPrice * qty;
                    items.putIfAbsent(itemId, itemTotal);

                }catch (SQLException e){
                    e.printStackTrace();
                }


            }
            System.out.println(items);
            return items;
        }
        public static void createNewSale(){
            handleItemTotal();
            Map<Integer, Float> sales = new HashMap<>();



        }

}


