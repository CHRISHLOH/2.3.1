package web.controller;

import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImp;

import java.util.List;

@Controller
public class CarController {
    @Autowired
    CarService carService;

    @GetMapping(value = "/cars")
    public String carModel(Model model, @RequestParam(value = "count",required = false) Integer count){
        List<Car> list;
        if (count == null || count >= 5){
            list = carService.getAllCars();
        } else {
            if(count < 0){
               list = carService.getCarsByCount(0);
            } else {
                list = carService.getCarsByCount(count);
            }
        }
        model.addAttribute("cars", list);
        return "cars";
    }
}
