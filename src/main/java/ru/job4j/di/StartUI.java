package ru.job4j.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import ru.job4j.di.input.ConsoleInput;
import ru.job4j.di.store.Store;

@Component
@Scope("prototype")
public class StartUI {

    @Autowired
    private Store store;

    @Autowired
    private ConsoleInput consoleInput;

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }

    public void init() {
        boolean run = true;
        while (run) {
            String query = this.consoleInput.askStr("Query: ");
            if (query.equals("stop")) {
                run = false;
            }
        }
    }
}