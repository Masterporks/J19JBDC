package entities;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity(name = "items")
@Data
@NoArgsConstructor
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")

    private String name;
    @Column(name = "description")
    private String desc;
    @Column(name = "qty_in_stock")
    private int qty;
    @Column(name = "price")
    private double price;


    public Item(String name, String description, int qty_in_stock, float price) {
        this.name = name;
        this.desc = description;
        this.qty = qty_in_stock;
        this.price = price;
    }
}