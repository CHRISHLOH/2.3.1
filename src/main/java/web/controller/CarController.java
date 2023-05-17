package web.controller;
import model.Car;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping(value = "/cars")
    public String carModel(Model model, @RequestParam(value = "count",required = false) Integer count){
        CarService cars = new CarServiceImp();
        List<Car> list;
        if (count == null || count >= 5){
            list = cars.getAllCars();
        } else {
            list = cars.getCarsByCount(count);
        }
        model.addAttribute("cars", list);
        return "cars";
    }
}
