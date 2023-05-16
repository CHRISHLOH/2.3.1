package service;

import dao.CarDaoImp;
import model.Car;

import java.util.List;

public class CarServiceImp implements CarService{

    CarDaoImp carDaoImp;

    @Override
    public List<Car> getAllCars() {
        return carDaoImp.getAllCars();
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return carDaoImp.getCarsByCount(count);
    }

    @Override
    public List<Car> getCarList() {
        return carDaoImp.getAllCars();
    }
}
