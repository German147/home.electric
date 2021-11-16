package com.electroservice.barreragerman.home.electric.controller;

import com.electroservice.barreragerman.home.electric.model.Appliance;
import com.electroservice.barreragerman.home.electric.repository.AppliancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appliance")
public class ApplianceController {

    @Autowired
    private AppliancesRepository appliancesRepository;

    @PostMapping("/postAppliance")
    public Appliance addAppliances(@RequestBody Appliance newAppliance){
        Appliance appl = new Appliance(
                newAppliance.getIdCode(),
                newAppliance.getName(),
                newAppliance.getBrand(),
                newAppliance.getQuantity(),
                newAppliance.getPrice(),
                newAppliance.getDescription());
        appliancesRepository.insert(appl);

        return appl;
    }

}
