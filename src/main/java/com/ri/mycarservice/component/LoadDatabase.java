package com.ri.mycarservice.component;

import com.ri.mycarservice.model.Car;
import com.ri.mycarservice.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class LoadDatabase implements ApplicationRunner {

    @Autowired
    private CarRepository repository;

    @Override
    public void run(ApplicationArguments applicationArguments) {
        repository.save(new Car("BMW","320i",1989,true,5));
        repository.save(new Car("Audi","A5",2000,false,4));
    }
}
