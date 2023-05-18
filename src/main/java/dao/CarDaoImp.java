package dao;

import model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class CarDaoImp implements CarDao{
    private List<Car> carList = new ArrayList<>();
    public CarDaoImp (){
        carList.add(new Car("Car1", 1, "red"));
        carList.add(new Car("Car2", 2, "white"));
        carList.add(new Car("Car3", 3, "blue"));
        carList.add(new Car("Car4", 4, "green"));
        carList.add(new Car("Car5", 5, "red"));
    }

    @Override
    public List<Car> getAllCars() {
        return getCarList();
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return getCarList().subList(0, count);
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

}
