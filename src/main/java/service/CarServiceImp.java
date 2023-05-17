package service;

import dao.CarDao;
import dao.CarDaoImp;
import model.Car;

import java.util.List;

public class CarServiceImp implements CarService{

    CarDao carDaoImp = new CarDaoImp();

    @Override
    public List<Car> getAllCars() {
        return carDaoImp.getAllCars();
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return carDaoImp.getCarsByCount(count);
    }
}
