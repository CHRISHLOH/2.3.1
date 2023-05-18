package web.service;

import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;
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
