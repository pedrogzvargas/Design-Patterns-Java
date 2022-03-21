package creational.factory.abstract_factory;

public class CarFactory extends VehicleAbstractFactory{
    public final int LUXURY = 1;
    public final int FAMILY = 2;

    @Override
    public Vehicle getVehicle(int vehicleType) {
        return switch (vehicleType) {
            case LUXURY -> new LuxuryCar();
            case FAMILY -> new FamilyCar();
            default -> throw new IllegalStateException("Unexpected value: " + vehicleType);
        };
    }
}
