package com.electroservice.barreragerman.home.electric.service;

import com.electroservice.barreragerman.home.electric.model.Appliance;

import java.util.List;
import java.util.Optional;

public interface ApplianceService {

    Appliance saveProduct(Appliance appliance);

    String deleteProduct(Integer idCode);

    Optional<Appliance> updateProduct(Appliance appliance, Integer idCode);

    Optional<Appliance> getProducts(Integer idCode);

    List<Appliance> listProducts();



}
