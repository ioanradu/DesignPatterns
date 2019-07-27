package abstractFactory;

import abstractFactory.car.Car;
import abstractFactory.car.Duster;
import abstractFactory.car.Logan;
import abstractFactory.car.Sandero;

public class DaciaFactory extends CarFactory{

    //private Car logan = new Logan(1600);

    public Car createCar(Integer engineSize){
        switch (engineSize){
            case 1200:
                return new Sandero(engineSize);
            case 1600:
                return new Logan(engineSize);
            case 2000:
                return new Duster(engineSize);

            default: return null;
        }

    }


}
