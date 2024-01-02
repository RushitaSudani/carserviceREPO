package org.technous.car.carservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.technous.car.carservice.entity.Car;
import org.technous.car.carservice.repository.CarServiceRepo;

import java.util.List;

@Service
public class CarServiceImpl implements CarServices{

    @Autowired
    private CarServiceRepo carServiceRepo;
    @Override
    public Car AddCarService(Car car) {

        Car car1=carServiceRepo.save(car);
        return car1;
    }
    @Override
    public List<Car> getAll() {
        List<Car> all=carServiceRepo.findAll();
        return all;
    }

    @Override
    public String deleteById(int id) {
        carServiceRepo.deleteById(id);
        return "deleted  ::"+id;

    }

    @Override
    public Car updateCar(Car car,int serviceId) {

        Car updateCar = carServiceRepo.findById(serviceId).orElse(null);
        if(updateCar!=null)
        {
            updateCar.setServiceName(car.getServiceName());
            carServiceRepo.save(updateCar);
            return updateCar;
        }
        else
        {
            return null;
        }
    }


}
