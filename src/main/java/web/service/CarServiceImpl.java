package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List<Car> carList ;
    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", 123, false));
        carList.add(new Car("Audi", 153, false));
        carList.add(new Car("BMW", 321, true));
        carList.add(new Car("Mercedes", 666, false));
        carList.add(new Car("Lada", 777, true));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }


    @Override
    public List<Car> getCarList(int limit) {
        return carList.stream().limit(limit).collect(Collectors.toList());
    }


}
