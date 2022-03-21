package creational.factory.abstract_factory;

public abstract class VehicleAbstractFactory {
    public static final int CarFactory = 1;
    public static final int MotorbikeFactory = 2;
    
    public abstract Vehicle getVehicle(int vehicleType);
    
    public static VehicleAbstractFactory getFactory(int factoryType){
        return switch (factoryType){
            case CarFactory -> new CarFactory();
            case MotorbikeFactory -> new MotorbikeFactory();
            default -> throw new IllegalStateException("Unexpected value: " + factoryType);
        };
    }
}
