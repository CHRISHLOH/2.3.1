package dao;

import model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{
    private List<Car> carList;
    @Override
    public List<Car> getAllCars() {
        return createCarList();
    }
    @Override
    public List<Car> getCarsByCount(int count) {
        return createCarList().subList(0, count);
    }
    @Override
    public List<Car> createCarList (){
        for(int i = 0; i < 5; i++){
            carList.add(new Car("Car"+ i, i));
        }
        return carList;
    }
}
