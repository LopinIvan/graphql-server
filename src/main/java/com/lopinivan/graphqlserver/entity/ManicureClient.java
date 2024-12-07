package com.lopinivan.graphqlserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "manicure_client")
public class ManicureClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clt_id")
    int id;
    @Column(name = "clt_name")
    String name;
    @Column(name = "clt_surname")
    String surname;
    @Column(name = "clt_email")
    String email;
    @Column(name = "clt_phone_number", unique = true)
    String phoneNumber;
    @Column(name = "clt_customer_review")
    String customerReview;
    @Column(name = "clt_amount_spent")
    int amountSpent;
    @Column(name = "clt_discount")
    int discount;

}
