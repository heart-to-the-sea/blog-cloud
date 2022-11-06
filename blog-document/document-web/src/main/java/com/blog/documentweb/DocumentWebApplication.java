package com.blog.documentweb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.view.tiles3.SpringWildcardServletTilesApplicationContext;

import java.util.Arrays;
import java.util.Iterator;

@SpringBootApplication
@ComponentScan("com.blog.*")
public class DocumentWebApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DocumentWebApplication.class, args);


    }

}
