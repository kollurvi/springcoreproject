package com.springcore.xml.di.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DocumentApplication {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("documentbean.xml");
        DocumentProcessor documentService = context.getBean("documentProcessor", DocumentProcessor.class);
        documentService.processDocument("Sample Document");
        ((ClassPathXmlApplicationContext) context).close();
    }
}
