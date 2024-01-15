package org.ecommerce.request.builder;

import com.github.javafaker.Faker;
import org.ecommerce.request.generator.UserRequest;

public class RequestBuilder {

    private static final Faker FAKER = Faker.instance();

    public static UserRequest getUserData() {
        return UserRequest.builder()
                .name(FAKER.name().name())
                .email("ajmalkhan92@gmail.com")
                .password("testtest")
                .title(FAKER.name().title())
                .birth_date(FAKER.number().numberBetween(1,30))
                .birth_month(FAKER.number().numberBetween(1,12))
                .birth_year(FAKER.number().numberBetween(1990,2000))
                .firstname(FAKER.name().firstName())
                .lastname((FAKER.name().lastName()))
                .company(FAKER.company().name())
                .address1(FAKER.address().fullAddress())
                .address2(FAKER.address().secondaryAddress())
                .country(FAKER.address().country())
                .zipcode(FAKER.address().zipCode())
                .state(FAKER.address().state())
                .city(FAKER.address().city())
                .mobile_number(FAKER.number().randomNumber(10,true))
                .build();
    }
}
