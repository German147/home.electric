package com.electroservice.barreragerman.home.electric.service;

import com.electroservice.barreragerman.home.electric.model.Appliance;
import com.electroservice.barreragerman.home.electric.repository.AppliancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ApplianceServiceImpl implements ApplianceService{

    @Autowired
    private AppliancesRepository appliancesRepository;

//    @Autowired
//    private MongoTemplate mongoTemplate;

    @Override
    public Appliance saveProduct(Appliance appliance) {
        return appliancesRepository.insert(appliance);
    }

    @Override
    public String deleteProduct(Integer idCode) {
        boolean exists = appliancesRepository.existsById(idCode);
        if(!exists){
            throw new IllegalStateException(" IdCode Appliance number " + idCode + " does not exist");
        } appliancesRepository.deleteById(idCode);
        return  "IdCode Appliance number " + idCode + " was succesfully deleted";
    }

    @Override
    public Optional<Appliance> updateProduct(Appliance appliance, Integer idCode) {
       Optional<Appliance> applianceOptional = appliancesRepository.findById(idCode);
       if (applianceOptional.isPresent()){
           Appliance appliance1 = applianceOptional.get();
           appliance1.setName(appliance.getName());
           appliance1.setBrand(appliance.getBrand());
           appliance1.setQuantity(appliance.getQuantity());
           appliance1.setPrice(appliance.getPrice());
           appliance1.setDescription(appliance.getDescription());
           appliancesRepository.save(appliance1);
       }
       return applianceOptional;
    }

    @Override
    public Optional<Appliance> getProducts(Integer idCode) {
        Optional<Appliance> appl = appliancesRepository.findById(idCode);
        return appl;
    }

    @Override
    public List<Appliance> listProducts() {
        List<Appliance> applianceList = appliancesRepository.findAll();
        return applianceList;
    }
}
