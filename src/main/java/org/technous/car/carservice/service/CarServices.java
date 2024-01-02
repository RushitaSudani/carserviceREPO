package org.technous.car.carservice.service;

import org.technous.car.carservice.entity.Car;

import java.util.List;

public interface CarServices {
    public Car AddCarService(Car car);
    public List<Car> getAll();

    public String deleteById(int id);

    Car updateCar(Car car, int serviceId);
}
