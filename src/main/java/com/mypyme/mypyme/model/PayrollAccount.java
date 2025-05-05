package com.mypyme.mypyme.model;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PayrollAccount {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 250)
    private String bankName;

    @Column(nullable = false, length = 25)
    private String accountNumber;

    @Column(nullable = false, length = 12)
    private String bankRoutingNumber;

    @Column(nullable = false, length = 10)
    private String accountType;

    @Column(nullable = false, length = 10)
    private String paymentFrequency;

    @OneToOne(mappedBy = "payrollAccount")
    private Employee employee; // Solo para lectura

}
