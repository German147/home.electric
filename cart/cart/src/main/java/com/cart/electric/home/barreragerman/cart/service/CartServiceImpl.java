package com.cart.electric.home.barreragerman.cart.service;

import com.cart.electric.home.barreragerman.cart.entity.Cart;
import com.cart.electric.home.barreragerman.cart.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public Cart saveAppliance(Cart cart) {
        return cartRepository.save(cart);
    }

    @Override
    public String deleteProduct(Integer id) {
        boolean exists = cartRepository.existsById(id);
        if(!exists){
            throw new IllegalStateException(" Id Cart number " + id + " does not exist");
        } cartRepository.deleteById(id);
        return  "Id Appliance number " + id + " was succesfully deleted";
    }

    @Override
    public Optional<Cart> updateAppliance(Cart cart, Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<Cart> getApplianceById(Integer id) {
       Optional<Cart> cartOptional = cartRepository.findById(id);
       return cartOptional;
    }


    @Override
    public List<Cart> listAppliances() {
        return null;
    }
}
