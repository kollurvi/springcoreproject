package com.springcore.xml.di.setter;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class WordDocument implements DocumentService {
    private String documentName;
    private String documentType;

    @Override
    public void processDocument(String docName) {
       documentName = docName;
       log.info("Processing Word document with name: {} and type: {}", documentName, documentType);
    }
}
