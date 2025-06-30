package com.springcore.xml.di.setter;

import lombok.AllArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@Setter
public class DocumentProcessor {
    private DocumentService documentService;

    public void processDocument(String document) {
        log.info("Processing document: {}", document);
        documentService.processDocument(document);
    }
}
