package com.springcore.annotation.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Log4j2
@Component
public class AddressLocation {
    private String location;

    public void getLocation() {
        log.info("Address Location: {}", location);
    }
}
