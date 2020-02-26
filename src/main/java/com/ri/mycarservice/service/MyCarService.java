package com.ri.mycarservice.service;

import com.ri.mycarservice.model.Car;
import com.ri.mycarservice.repository.CarMakeList;

import java.util.List;

public interface MyCarService {
    List<Car> getCarList();
    List<CarMakeList> getCarMakeList();
    Car getCarDetailsById(Long id);
}
