package service;

import dao.CarDao;
import dao.CarDaoImp;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getAllCars() {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCarsByCount(int count) {
        return carDao.getCarsByCount(count);
    }
}
