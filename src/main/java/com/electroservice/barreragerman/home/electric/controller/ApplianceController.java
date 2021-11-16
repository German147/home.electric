package com.electroservice.barreragerman.home.electric.controller;

import com.electroservice.barreragerman.home.electric.model.Appliance;
import com.electroservice.barreragerman.home.electric.repository.AppliancesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/home_electric")
public class ApplianceController {

    @Autowired
    private AppliancesRepository appliancesRepository;

    @PostMapping("/postAppliance")
    public Appliance addAppliances(@RequestBody Appliance newAppliance) {
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

    @GetMapping("/appliances")
    public List<Appliance> getAppliances() {
        List<Appliance> applianceList = appliancesRepository.findAll();
        return applianceList;
    }

    @GetMapping("/appliance/{idCode}")
    public Optional<Appliance> getAppliance(@PathVariable Integer idCode){
        Optional<Appliance> app = appliancesRepository.findById(idCode);
        return  app;
    }




}
