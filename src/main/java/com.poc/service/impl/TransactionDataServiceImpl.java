package com.poc.service.impl;

import com.poc.domain.model.entity.Car;
import com.poc.repository.CarRepository;
import com.poc.service.TransactionDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Service Layer to compute matrix val and generate random operations.
 */

@Service
public class TransactionDataServiceImpl implements TransactionDataService {

    @Autowired
    private CarRepository carRepository;


    @Transactional
    public List<Car> fetchData(){
        saveData();
        return carRepository.findAll();
    }

    private void saveData(){
        Car car1 = new Car(1L,"Toyota","22");
        Car car2 = new Car(2L,"BMW","17");
        Car car3 = new Car(3L,"Audi","7");
        Car car4 = new Car(4L,"Maruti","45");
        Car car5 = new Car(5L,"Renault","20");
        Car car6 = new Car(6L,"Nissan","15");
        Car car7 = new Car(7L,"Ford","16");
        Car car8 = new Car(8L,"Jaguar","8");


        carRepository.save(car1);
        carRepository.save(car2);
        carRepository.save(car3);
        carRepository.save(car4);
        carRepository.save(car5);
        carRepository.save(car6);
        carRepository.save(car7);
        carRepository.save(car8);
    }
}
