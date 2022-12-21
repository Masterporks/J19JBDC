package org.example;
import controllers.Customer;
import controllers.Item;
import controllers.Orders;
import controllers.Sales;
import controllers.menu.Menu;

import static controllers.Item.getAllItems;

public class Main {
    public static void main(String[] args) {

        //Item.getAllItems();
       // Item.createNewItem();
        //Item.getAllItems();
        //Item.updateItem();
        //Item.deleteItem();
        //Item.getItemById();
        //Item.getAllItems();
        Customer.getAllCustomers();
        Customer.createCustomerTable();
        //Item.createItemsTable();
        //Orders.createOrdersTable();
        //Sales.createSalesTable();

        //Subsequent object will have their create table methods here
        Menu.mainMenu();

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

    }

}