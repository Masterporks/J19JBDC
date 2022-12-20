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

        Customer.createCustomerTable();
        Item.createItemsTable();
        Orders.createOrdersTable();
        Sales.createSalesTable();

        //Subsequent object will have their create table methods here
        Menu.mainMenu();

        //Add 2 feature to this application that allows user to view all the orders and all the sales
    }

}