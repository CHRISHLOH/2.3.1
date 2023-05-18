package web.controller;
import config.AppConfig;
import model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    CarService carService = context.getBean(CarServiceImp.class);
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
