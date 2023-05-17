package service;

import model.Car;

import java.util.List;

public interface CarService {
    public List<Car> getAllCars();

    public List<Car> getCarsByCount(int count);
}
