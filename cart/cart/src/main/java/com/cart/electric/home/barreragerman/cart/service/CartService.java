package com.cart.electric.home.barreragerman.cart.service;

import com.cart.electric.home.barreragerman.cart.entity.Cart;

import java.util.List;
import java.util.Optional;

public interface CartService {

    Cart saveAppliance(Cart cart);

    String deleteProduct(Integer id);

    Optional<Cart> updateAppliance(Cart cart, Integer id);

    Optional<Cart> getApplianceById(Integer id);

    List<Cart> listAppliances();

}
