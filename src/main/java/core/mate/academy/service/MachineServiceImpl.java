package core.mate.academy.service;

import java.util.List; // Стандартні імпорти йдуть першими
import java.util.ArrayList;

import core.mate.academy.model.Machine; // Власні класи після стандартних
import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Truck;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {

    @Override
    public <T extends Machine> void fill(List<T> machines, T value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> machines) {
        for (int i = 0; i < machines.size(); i++) {
            machines.get(i).doWork();
        }
    }

    @Override
    public List<? extends Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return bulldozerProducer.get();
        }
        if (type == Excavator.class) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return excavatorProducer.get();
        }
        if (type == Truck.class) {
            TruckProducer truckProducer = new TruckProducer();
            return truckProducer.get();
        }
        return List.of(); // Повертаємо порожній список, якщо тип не підтримується
    }
}

