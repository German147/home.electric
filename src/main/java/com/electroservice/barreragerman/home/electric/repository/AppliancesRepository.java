package com.electroservice.barreragerman.home.electric.repository;

import com.electroservice.barreragerman.home.electric.model.Appliance;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AppliancesRepository extends MongoRepository<Appliance, Integer> {
}
