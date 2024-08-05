
//till 6--> from 7 applying setter injection 
//package com.library.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.library.repository.BookRepository;
//
//@Service
//public class BookService {
//    private BookRepository bookRepository;
//
//    // Setter method for dependency injection
//    @Autowired
//    public void setBookRepository(BookRepository bookRepository) {
//        this.bookRepository = bookRepository;
//    }
//
//    public void performService() {
//        System.out.println("Service layer logic with repository: " + bookRepository);
//        bookRepository.saveBook();
//    }
//}

package com.library.service;

import com.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
    private BookRepository bookRepository;
    private BookRepository additionalRepository;

    // Constructor for constructor injection
    @Autowired
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Setter method for setter injection
    @Autowired
    public void setAdditionalRepository(BookRepository additionalRepository) {
        this.additionalRepository = additionalRepository;
    }

    public void performService() {
        System.out.println("Service layer logic with repository: " + bookRepository);
        bookRepository.saveBook();
        System.out.println("Additional repository logic: " + additionalRepository);
        additionalRepository.saveBook();
    }
}

