package com.example.miniProject.bursaMobil.services;


import com.example.miniProject.bursaMobil.entities.BursaMobilEntitiy;
import com.example.miniProject.bursaMobil.repositories.BursaMobilRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BursaMobilService {
    @Autowired
    private BursaMobilRepository repository;

    public BursaMobilEntitiy saveCar(BursaMobilEntitiy car) {
        return repository.save(car);
    }

    public List<BursaMobilEntitiy> saveCars (List<BursaMobilEntitiy> cars) {
        return repository.saveAll(cars);
    }

    public List<BursaMobilEntitiy> getCars() {
        return repository.findAll();
    }

    public BursaMobilEntitiy getCarById(int id) {
        return repository.findCarById(id);
    }

    public BursaMobilEntitiy getCarByName(String name) {
        return repository.findByName(name);
    }

    public String deleteCar(int id) {
        repository.deleteById(id);
        return "car removed !! " + id;
    }

    public BursaMobilEntitiy updateCar(BursaMobilEntitiy car) {
        BursaMobilEntitiy existingCar = repository.findById(car.getId()).orElse(null);
        existingCar.setName(car.getName());
        existingCar.setColor(car.getColor());
        existingCar.setStock(car.getStock());
        existingCar.setType(car.getType());
        return repository.save(existingCar);
    }

}
