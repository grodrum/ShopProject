package ua.javabegin.training.java2.equipment;

import ua.javabegin.training.java2.interfaces.EquipmentInterface;

public abstract class BaseEquipment implements EquipmentInterface {
    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isElectric() {
        return false;
    }
}
