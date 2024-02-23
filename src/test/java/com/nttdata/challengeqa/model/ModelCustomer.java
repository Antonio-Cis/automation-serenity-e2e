package com.nttdata.challengeqa.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
@Setter
@Getter
@AllArgsConstructor
public class ModelCustomer {
    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private String address1;
    private String city;
    private String postcode;
}
