package com.mypyme.mypyme.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PayrollAccount {

    private Long id;

    private String bankName;

    private String accountNumber;

    private String bankRoutingNumber;

    private String accountType;

    private String paymentFrequency;

    //¿Cómo manejamos el Uno es a Uno?
    private Employee employee; // Solo para lectura

}
