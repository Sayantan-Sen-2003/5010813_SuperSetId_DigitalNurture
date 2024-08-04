package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load Spring context from XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Use the BookService bean
        bookService.performService();
    }
}

//Exercise-2
//Service layer logic with repository: com.library.repository.BookRepository@87a85e1
//Saving book...

//Excersise-3
// [main] INFO com.library.aspect.LoggingAspect - Starting method: performService
// Service layer logic with repository: com.library.repository.BookRepository@b86de0d
// Saving book...
// [main] INFO com.library.aspect.LoggingAspect - Finished method: performService