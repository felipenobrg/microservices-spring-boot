package com.felipenobrg.ecommerce.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Document
public class Customer {
    private String id;
    private String firstName;
    private String lastName;
    private String email;
    private Adress adress;
}
