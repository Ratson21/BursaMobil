package com.example.miniProject.bursaMobil.controllers;


import com.example.miniProject.bursaMobil.entities.BursaMobilEntitiy;
import com.example.miniProject.bursaMobil.repositories.BursaMobilRepository;
import com.example.miniProject.bursaMobil.services.BursaMobilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/bursaMobil")
public class BursaMobilController {

    @Autowired
    BursaMobilService bursaMobilService;
    BursaMobilRepository bursaMobilRepository;

    @GetMapping("/getAllCars")
    public List<BursaMobilEntitiy> findAllCars()
    {
        return bursaMobilService.getCars();
    }

    @GetMapping("/getCarById/{id}")
    public BursaMobilEntitiy findById(@PathVariable int id ){
        return bursaMobilService.getCarById(id);
    }



    @PostMapping("/addCar")
    public BursaMobilEntitiy addcar(@RequestBody BursaMobilEntitiy bursaMobilEntitiy) {
        return bursaMobilService.saveCar(bursaMobilEntitiy);
    }

    @PostMapping("/addCars")
    public List<BursaMobilEntitiy> addCars(@RequestBody List<BursaMobilEntitiy> bursaMobilEntitiys){
        return bursaMobilService.saveCars(bursaMobilEntitiys);
    }

    @PutMapping("/updateCar")
    public BursaMobilEntitiy updateCar(@RequestBody BursaMobilEntitiy bursaMobilEntitiy) {
        return bursaMobilService.updateCar(bursaMobilEntitiy);
    }

    @DeleteMapping("/deleteCar/{id}")
    public String deleteCar(@PathVariable int id) {
        return bursaMobilService.deleteCar(id);
    }


}
