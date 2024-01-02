package org.technous.car.carservice.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.technous.car.carservice.entity.Car;
import org.technous.car.carservice.repository.CarServiceRepo;
import org.technous.car.carservice.service.CarServices;
import org.technous.car.carservice.util.ApiResponse;
import java.util.List;
@RestController
@CrossOrigin("http://localhost:3001")
@RequestMapping("/service")

public class ServiceController {
    @Autowired
    private CarServices carServices;

    @PostMapping("/addcar")
    public ApiResponse addcar(@RequestBody Car car)
    {
        if(car!=null)
        {
            Car c1=carServices.AddCarService(car);
            if(c1!=null)
            {
                return new ApiResponse("savedd",200,c1);
            }
            else
            {
                return new ApiResponse("dataa not found",500,null);
            }
        }
        else
        {
            return new ApiResponse("internall server error",500,null);
        }
    }
    @GetMapping("/getallcar")
    public List<Car> getAll() {
        List<Car> all=carServices.getAll();
        return all;
    }

    @DeleteMapping("/deletecar/{id}")
    public String deletecar(@PathVariable("id") int id) {
        return carServices.deleteById(id);
    }

    @PutMapping("/updatecar/{serviceId}")
    public Car updateCar(@PathVariable("serviceId") int id,@RequestBody Car car) {
        return carServices.updateCar(car,id);
    }

}
