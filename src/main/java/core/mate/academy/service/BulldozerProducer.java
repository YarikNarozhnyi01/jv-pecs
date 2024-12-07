package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.List;
import java.util.ArrayList;

public class BulldozerProducer implements MachineProducer<Bulldozer> {
    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer());
        bulldozers.add(new Bulldozer());
        return bulldozers;
    }
}
