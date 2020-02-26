package com.ri.mycarservice.service;

import com.ri.mycarservice.exceptions.CarNotFoundException;
import com.ri.mycarservice.model.Car;
import com.ri.mycarservice.repository.CarMakeList;
import com.ri.mycarservice.repository.CarMakeListRepository;
import com.ri.mycarservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCarServiceImpl implements MyCarService {

    @Autowired
    private CarRepository carRepository;

    @Autowired
    private CarMakeListRepository carMakeListRepository;

    /* Get all cars */
    @Override
    public List<Car> getCarList() {
        return carRepository.findAll();
    }

    /* Get the car make list + the ids*/
    @Override
    public List<CarMakeList> getCarMakeList() {
        return carMakeListRepository.findBy();
    }

    /* Get the car by id*/
    @Override
    public Car getCarDetailsById(Long id) {
        return carMakeListRepository.findById(id)
                    .orElseThrow(()-> new CarNotFoundException("Could not find car with id: " + id));
    }
}
