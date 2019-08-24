package com.poc.repository;

import com.poc.domain.model.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by manju on 23-08-2019.
 */
@Repository
public interface CarRepository extends JpaRepository<Car, Long>{}
