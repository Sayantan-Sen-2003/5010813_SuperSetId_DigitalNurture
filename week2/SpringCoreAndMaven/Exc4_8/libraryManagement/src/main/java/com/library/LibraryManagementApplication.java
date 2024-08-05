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

//Output-5
//Service layer logic with repository: com.library.repository.BookRepository@6497b078
//Saving book...

//Output-6
//Service layer logic with repository: com.library.repository.BookRepository@6497b078
//Saving book...


//output-7
//Service layer logic with repository: com.library.repository.BookRepository@14fc5f04
//Saving book...
//Additional repository logic: com.library.repository.BookRepository@14fc5f04
//Saving book...