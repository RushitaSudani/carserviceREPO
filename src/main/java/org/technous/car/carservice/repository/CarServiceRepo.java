package org.technous.car.carservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.technous.car.carservice.entity.Car;
@Repository
public interface CarServiceRepo extends JpaRepository<Car,Integer> {
}
