package com.ri.mycarservice.repository;

import com.ri.mycarservice.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CarListRepository extends JpaRepository<Car, Long> {
    List<CarList> findBy();

    Optional<Car> findById(Long id);
}
