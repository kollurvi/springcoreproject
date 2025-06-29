package com.springcore.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component
public class Address {
    @Autowired
    public AddressLocation address;

    public void getAddress() {
       address.getLocation();
    }

    public void setAddress() {
        address.setLocation("123 Main St, Springfield");
    }
}
