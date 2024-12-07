package core.mate.academy.service;

import java.util.List; // Повинен йти перед ArrayList
import java.util.ArrayList; // Імпорти з java.util повинні йти в правильному порядку
import core.mate.academy.model.Bulldozer; // Ваш власний клас імпортується після стандартних

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}
