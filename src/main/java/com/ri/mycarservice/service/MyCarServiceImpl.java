package com.ri.mycarservice.service;

import com.ri.mycarservice.exceptions.CarNotFoundException;
import com.ri.mycarservice.model.Car;
import com.ri.mycarservice.repository.CarList;
import com.ri.mycarservice.repository.CarListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyCarServiceImpl implements MyCarService {

    @Autowired
    private CarListRepository carListRepository;

    /* Get the car make list + the ids*/
    @Override
    public List<CarList> getCarList() {
        return carListRepository.findBy();
    }

    /* Get the car details by id*/
    @Override
    public Car getCarDetailsById(Long id) {
        return carListRepository.findById(id)
                    .orElseThrow(()-> new CarNotFoundException("Could not find car with id: " + id));
    }
}
