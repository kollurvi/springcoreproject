package com.springcore.annotation.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Scope("prototype") // or "singleton", "request", "session", etc.)
@Component
public class Customer {

}
