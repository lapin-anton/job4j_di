package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        System.out.println("Main UI store items: ");
        ui.print();
        StartUI anotherUI = context.getBean(StartUI.class);
        System.out.println("Another UI store items: ");
        anotherUI.print();
        ui.init();
    }
}
