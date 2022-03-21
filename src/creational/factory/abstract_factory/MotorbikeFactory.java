package creational.factory.abstract_factory;

public class MotorbikeFactory extends VehicleAbstractFactory{
    public final int SPORT = 1;
    public final int CRUISE = 2;
    
    @Override
    public Vehicle getVehicle(int vehicleType) {
        return switch (vehicleType){
            case SPORT -> new SportMotorbike();
            case CRUISE -> new CruiseMotorbike();
            default -> throw new IllegalStateException("Unexpected value: " + vehicleType);
        };
    }
}
