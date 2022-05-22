package com.example.miniProject.bursaMobil.repositories;

import com.example.miniProject.bursaMobil.entities.BursaMobilEntitiy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BursaMobilRepository extends JpaRepository<BursaMobilEntitiy, Integer> {
    BursaMobilEntitiy findByName(String name);

    @Query(value = "SELECT * FROM car WHERE id = :id", nativeQuery = true)
    BursaMobilEntitiy findCarById(int id);

//    @Query(value = "INSERT INTO car (id ,name,`type`,color,stock) VALUES (:id, :name, :type, :color, :stock)", nativeQuery = true)
//    BursaMobilEntitiy addCar();
//    void addCar(@Param("id") int id,@Param("name") String name, @Param("type") String type,
//                @Param("color") String color, @Param("stock") String stock);

//    @Query(value = "DELETE FROM car WHERE id = :id", nativeQuery = true)
//    BursaMobilEntitiy deleteCarById(int id);

    //    @Query(value = "UPDATE SET color = :color, name = :name, stock = :stock, type = :type WHERE id = :id, nativeQuery = true)
//    BursaMobilEntitiy addCar();
//    void addCar(@Param("id") int id,@Param("name") String name, @Param("type") String type,
//                @Param("color") String color, @Param("stock") String stock);


}
