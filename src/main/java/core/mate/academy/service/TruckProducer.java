package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.List;
import java.util.ArrayList;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck());
        trucks.add(new Truck());
        return trucks;
    }
}
