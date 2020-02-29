package com.ri.mycarservice.service;

import com.ri.mycarservice.model.Car;
import com.ri.mycarservice.repository.CarList;

import java.util.List;

public interface MyCarService {
    List<CarList> getCarList();
    Car getCarDetailsById(Long id);
}
