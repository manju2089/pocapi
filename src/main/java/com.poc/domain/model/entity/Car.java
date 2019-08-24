package com.poc.domain.model.entity;

/**
 * Created by manju on 23-08-2019.
 */

import javax.persistence.Entity;
import javax.persistence.Id;
import lombok.*;


@Getter
@Setter
@ToString
@Entity

public class Car {

    @Id
    private Long id;
    private String model;
    private String salePercentage;
  //  private String bodyType;
   // private String transmissionType;

    public Car() {
    }

    public Car(Long id, String model, String salePercentage) {
        this.id = id;
        this.model = model;
        this.salePercentage = salePercentage;
        //this.bodyType = bodyType;
        //this.transmissionType = transmissionType;
    }

}
