package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {

    public List<Car> getCarsForCount(int count) {
        List<Car> cars = Car.createFiveCars();
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
