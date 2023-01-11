package entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;



    @Entity(name = "sales")
    @Data
    @NoArgsConstructor
    public class Sales {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;

        @OneToOne
        @JoinColumn(name = "customer_id")
        private Customer customer;
        @Column(name = "date_purchased")
        private Timestamp date_purchased;
        @Column(name = "total")
        private float total;

        public Sales(int customerId, Timestamp date_purchased, float total) {
            this.customer.setId(customerId);
            this.date_purchased = date_purchased;
            this.total = total;
        }
    }

