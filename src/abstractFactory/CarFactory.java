package abstractFactory;

import abstractFactory.car.Car;

public abstract class CarFactory {
    public abstract Car createCar(Integer engineSize);
}
