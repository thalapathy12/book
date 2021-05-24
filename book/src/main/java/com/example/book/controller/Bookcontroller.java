package com.example.book.controller;

import com.example.book.BookApplication;
import com.sun.org.apache.xpath.internal.objects.XString;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.namespace.QName;
import java.awt.print.Book;

@Controller
@RequestMapping("/book")
public class Bookcontroller {
    @Autowired
    Bookrepo bookrepo;

    private String name;
    private String authorname;
    private int pages;


    @RequestMapping("/update")
    public void update(){


        Book book = new Book("java","hf",233);
        bookrepo.save(book);
    }
}
