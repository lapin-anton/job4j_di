package ru.job4j.di;

import org.springframework.stereotype.Component;
import ru.job4j.di.input.ConsoleInput;
import ru.job4j.di.store.Store;

@Component
public class StartUI {

    private Store store;

    private ConsoleInput consoleInput;

    public StartUI(Store store, ConsoleInput consoleInput) {
        this.store = store;
        this.consoleInput = consoleInput;
    }

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