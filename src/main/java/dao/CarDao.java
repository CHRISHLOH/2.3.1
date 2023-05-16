package dao;

import model.Car;

import java.util.List;

public interface CarDao {

    public List<Car> getAllCars();

    public List<Car> getCarsByCount(int count);

    public List<Car> getCarList();

}
