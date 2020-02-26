package com.ri.mycarservice.repository;

import com.ri.mycarservice.model.Car;
import com.sun.xml.bind.v2.model.core.ID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarMakeListRepository extends JpaRepository<Car, Long> {
    List<CarMakeList> findBy();
    Optional<Car> findById(Long id);
}
