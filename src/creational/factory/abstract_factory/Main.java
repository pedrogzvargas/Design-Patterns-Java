package creational.factory.abstract_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el tipo de fabrica");
        int typeFactory = scanner.nextInt();
        VehicleAbstractFactory vehicleAbstractFactory = VehicleAbstractFactory.getFactory(typeFactory);
        System.out.println("Digite el tipo de vehiculo");
        int typeVehicle = scanner.nextInt();
        Vehicle vehicle = vehicleAbstractFactory.getVehicle(typeVehicle);
        System.out.println("Llantas " + vehicle.getWheels());
        System.out.println("Asientos " + vehicle.getSeats());
    }
}