package com.cart.electric.home.barreragerman.cart.repository;

import com.cart.electric.home.barreragerman.cart.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {
}
