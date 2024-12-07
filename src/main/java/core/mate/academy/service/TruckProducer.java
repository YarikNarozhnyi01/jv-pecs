package core.mate.academy.service;

import java.util.List; // Імпорти з java.util повинні йти першими
import java.util.ArrayList; // ArrayList йде після List
import core.mate.academy.model.Truck; // Ваш клас після стандартних

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
        return trucks;
    }
}
