package com.javaguru.shoppinglist;

import Config.AppConfig;
import com.javaguru.shoppinglist.console.ConsoleUI;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class ShoppingListApplication {
    
public static void main(String[] args) {
    ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    ConsoleUI console = context.getBean(ConsoleUI.class);
    console.execute();
}
}
