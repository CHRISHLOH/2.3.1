package web.controller;

import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @GetMapping(value = "/cars")
    public String carModel(Model model, @RequestParam(value = "count",required = false) Integer count){
        List<Car> list;
        if (count == null || count >= 5){
            list = carService.getAllCars();
        } else {
            list = carService.getCarsByCount(count);
        }
        model.addAttribute("cars", list);
        return "cars";
    }
}
