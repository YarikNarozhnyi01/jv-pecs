package core.mate.academy.service;

import java.util.List; // Повинен йти перед ArrayList
import java.util.ArrayList; // Імпорти з java.util повинні йти в правильному порядку
import core.mate.academy.model.Excavator; // Ваш клас імпортується після стандартних


public class ExcavatorProducer implements MachineProducer<Excavator> {
    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator());
        excavators.add(new Excavator());
        return excavators;
    }
}
