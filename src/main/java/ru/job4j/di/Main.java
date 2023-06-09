package ru.job4j.di;

import ru.job4j.di.input.ConsoleInput;
import ru.job4j.di.store.Store;

public class Main {

    public static void main(String[] args) {
        Context context = new Context();
        context.reg(Store.class);
        context.reg(ConsoleInput.class);
        context.reg(StartUI.class);

        StartUI ui = context.get(StartUI.class);

        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui.print();
        ui.init();
    }

}
