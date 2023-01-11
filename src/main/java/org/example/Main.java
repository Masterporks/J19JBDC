package org.example;

import entities.Customer;
import entities.Item;
import db.Database;
import entities.Orders;
import entities.Sales;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {

        //Item.getAllItems();
        // Item.createNewItem();
        //Item.getAllItems();
        //Item.updateItem();
        //Item.deleteItem();
        //Item.getItemById();
        //Item.getAllItems();
        // Customer.getAllCustomers();
        //Customer.createCustomerTable();
        //Item.createItemsTable();
        //Orders.createOrdersTable();
        //Sales.createSalesTable();

        //Subsequent object will have their create table methods here
        //Menu.mainMenu();


       // Session session = Database.getHibSesh();

        //Orders order = session.find(Orders.class, 1);
        //System.out.println(order);

        Customer.listCustomers();

       // Customer minaj = new Customer("Nicki", "Minaj","nickiminaj@gmail.com");
        //Customer.createCustomer(minaj);
        //Customer.updateCustomer("Barry", 6);
        Customer.deleteCustomer(7);
        Customer.listCustomers();
        // Customer cust = session.find(Customer.class, 2);
        // System.out.println(cust);
        //Sales sale = session.find(Sales.class, 3);
        //System.out.println(sale);

        //Item scissors = new Item("Scissors", "to cut things", 33, 2.5f);

        //try{
        //  Transaction trans = session.beginTransaction();
        //session.save(scissors);
        //trans.commit();

        //} catch(Exception e){
        //  e.printStackTrace();
    //}



        //Add 2 feature to this application that allows user to view all the orders and all the sales


        // Complete the Customer class by adding the CREATE, UPDATE and DELETE functionalities
        // to handle those respective operations on a customer objects or record.

        // Create a method on Sales class that takes in  the following input
        // from user:
        // item_id
        // qty_purchased

        //Exercise:
        //Complete the sales class by adding the following methods.
        //Add a method called createNewSale:
        // - collate the total price of the all items bought and insert a new
        // record in the sales table, then it should return the id of the newly created
        // sale record

        //Add a method called createSaleOrder:

        //Create a table called Students and another table called Grades
        //The columns on the students table should be as follows: id, name, age
        //Complete the controllers for the students table by adding methods
        // to handle CRD operations on each record in a table.

        //On the Grades table, store the students id, score and the Grades where
        //The columns on Grades should be : id , student_id, score
        // for each Grade:
        // 0-40 F, 40-49 is an D , 50-59 C , 60- 69 B 70-100 A.
        // Complete the controller on the Grades table to have Create  Read and Delete operation
        //For the read operation , you should be able to see the students information as well




        //Using Hibernate create the entity object for the items class and
        // make find queries on the items table to retreive any items you previously stored on it
        // Also demonstrate how you would save a new entry into the items table.


        //How to hack the SELECT * FROM []; query
        //Difference between certain hibernate methods
    }


}