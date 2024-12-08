package core.mate.academy.service;

import core.mate.academy.model.Machine;
import java.util.List;

/**
 * Parameterized interface for machine service.
 */
public interface MachineService<T extends Machine> {

    /**
     * Return the list of machines based on the passed type.
     * This method uses your MachineProducer implementations.
     *
     * @param type - any class of Machine subclass. For example: Truck.class or Bulldozer.class
     * @return the list of machines
     */
    List<? extends Machine> getAll(Class<? extends Machine> type);

    /**
     * Fill the machines list with passed value.
     * This method should be able to work well with any type of machine passed as 'value'.
     *
     * @param machines - list of machines to be filled with value
     * @param value    - any object of machine subclass
     */
    <T extends Machine> void fill(List<T> machines, T value);

    /**
     * Call the method doWork() from each machine.
     * This method should be able to accept a list of bulldozers as well as a list of trucks.
     *
     * @param machines - the list of machines
     */
    void startWorking(List<? extends Machine> machines);
}
