package ru.skypro.calculateShop.service.impl;

import ru.skypro.calculateShop.service.ShoppingCart;
import ru.skypro.calculateShop.service.StoreService;

import java.util.List;

public class StoreServiceImpl implements StoreService {

    private final ShoppingCart shoppingCart;

    public StoreServiceImpl(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }
    @Override
    public List<Integer> add (List<Integer> goods) {
        return null;
    }

    @Override
    public List<Integer> get() {
        return null;
    }

}
