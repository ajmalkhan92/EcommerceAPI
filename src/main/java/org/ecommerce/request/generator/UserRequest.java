package org.ecommerce.request.generator;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserRequest {

    private String  name;
    private String email;
    private String password;
    private String title;
    private int birth_date;
    private int birth_month;
    private int birth_year;
    private String firstname;
    private String lastname;
    private String company;
    private String address1;
    private String address2;
    private String country;
    private String zipcode;
    private String state;
    private String city;
    private long mobile_number;
}

