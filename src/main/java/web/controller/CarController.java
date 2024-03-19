package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;

import java.util.List;
import java.util.stream.Collectors;

@Controller
public class CarController {
    @Autowired
    private CarService carService;

    @RequestMapping("/cars")
    public String getAllCars(@RequestParam(required = false, name = "count") Integer count, Model model) {

        count = count == null || count >= 5 ? carService.getCarList().size() : count;

        List<Car> carList = carService.getCarList(count);

        model.addAttribute("cars", carList);
        return "cars";
    }

}
