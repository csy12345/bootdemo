package com.example.demo.mapper;

import com.example.demo.bean.Car;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CarMapper {
    public List<Car> viewCar();
    public List<Car> manageviewCar();
    Car selectCar(String carid);
    void deleteCar(String carid);
    boolean addCar(@Param("car") Car car);
    Car modifyCar(String carid);
    boolean updateCar(@Param("car") Car car);

}
