package com.springcore.annotation.scope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeApplicationMain {
    public static void main(String[] args) {
        // Create an application context
        org.springframework.context.ApplicationContext context = new org.springframework.context.annotation.AnnotationConfigApplicationContext("com.springcore.annotation.scope");

        //Singleton bean checking
        MySingletonBean singletonBean1 = context.getBean(MySingletonBean.class);
        singletonBean1.incrCounterAndGetValue();

        MySingletonBean singletonBean2 = context.getBean(MySingletonBean.class);
        singletonBean2.incrCounterAndGetValue();

        MySingletonBean singletonBean3 = context.getBean(MySingletonBean.class);
        singletonBean3.incrCounterAndGetValue();

        //Prototype bean checking
        MyPrototypeBean prototypeBean1 = context.getBean(MyPrototypeBean.class);
        prototypeBean1.incrCounterAndGetValue();

        MyPrototypeBean prototypeBean2 = context.getBean(MyPrototypeBean.class);
        prototypeBean2.incrCounterAndGetValue();

        MyPrototypeBean prototypeBean3 = context.getBean(MyPrototypeBean.class);
        prototypeBean3.incrCounterAndGetValue();
    }
}
