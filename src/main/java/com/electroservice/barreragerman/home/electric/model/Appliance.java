package com.electroservice.barreragerman.home.electric.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("appliances_Items")
@Data @AllArgsConstructor @NoArgsConstructor @Builder
public class Appliance {

    private Integer idCode;

    private String name;
    private String brand;
    private String quantity;
    private double price;
    private String description;



}
