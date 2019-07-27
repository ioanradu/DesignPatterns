package abstractFactory;

import abstractFactory.car.Car;

public class CarDealer {

    public Car deliverCar(Double budget, Integer engineSize) {
        CarFactory carFactory = null;
        if (budget > 15000) {
            carFactory = new AudiFactory();
        }else {
            carFactory = new DaciaFactory();
        }
        return carFactory.createCar(engineSize);
    }
}
