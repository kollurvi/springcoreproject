package com.springcore.springdao;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@PropertySource("httpconnection.properties")
public class PropertyDataReader {

    @Value("${connection.ipAddress}")
    private String ipAddress;

    @Value("${connection.portNumber}")
    private String portNumber;

    @Value("${connection.connType}")
    private String connType;
 }
