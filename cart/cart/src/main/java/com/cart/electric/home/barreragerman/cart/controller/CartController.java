package com.cart.electric.home.barreragerman.cart.controller;

import com.cart.electric.home.barreragerman.cart.entity.Appliance;
import com.cart.electric.home.barreragerman.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/myCart")
public class CartController {

    @Autowired
    private RestTemplate restTemplate;
    private CartRepository cartRepository;

@GetMapping("/appliance/{idCode}")
    public Appliance getAppliance(@PathVariable Integer idCode){

    Appliance appl = restTemplate.getForObject("localhost:1111/home_electric/appliances"+idCode, Appliance.class);
    return appl;
}

//@GetMapping("/cartAppliances/{id}")
//    public List<Appliance> getAppliances(){
//    Appliance appl = restTemplate.getForObject("localhost:1111/home_electric/appliances" + id + Appliance.class);
//    return null;
//}
/*@GetMapping("/appliances")
    public List<Appliance> getAppliances() {
        List<Appliance> applianceList = appliancesRepository.findAll();
        return applianceList;
    }*/

}
