package com.ri.mycarservice.controllers;

import com.ri.mycarservice.model.Car;
import com.ri.mycarservice.repository.CarList;
import com.ri.mycarservice.service.MyCarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyCarServiceController {

    @Autowired
    private MyCarService myCarService;

    // Get the carlist only with make field and id
    @RequestMapping(value = "/carlist", method = RequestMethod.GET)
    public List<CarList> getCarMakeList() {
        return myCarService.getCarList();
    }

    // Get car details based on a id
    @RequestMapping(value = "/carlist/{id}", method = RequestMethod.GET)
    public Car getCarDetailsById(@PathVariable(name = "id") Long id) {
        return myCarService.getCarDetailsById(id);
    }

}
