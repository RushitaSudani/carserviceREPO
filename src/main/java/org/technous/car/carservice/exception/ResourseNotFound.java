package org.technous.car.carservice.exception;

public class ResourseNotFound extends RuntimeException{
    public ResourseNotFound()
    {
        super("Resourse not Found");
    }
    public ResourseNotFound(String msg)
    {
        System.out.println(msg);
    }

}
