package entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

    @Entity(name = "orders")
    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    public class Orders {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        @ManyToOne
        @JoinColumn(name = "sale_id")
        private Sales saleId;
        @ManyToOne
        @JoinColumn(name = "item_id")
        private Item itemId;
        @Column(name = "qty_purchased")
        private int qty;
        @Column(name = "item_total")
        private int total;


    }


