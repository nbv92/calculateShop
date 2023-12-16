package ru.skypro.calculateShop.service;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class ShoppingCart {

    private final List<Integer> goods = new ArrayList<>();


    public List<Integer> add(List<Integer> goods) {
        this.goods.addAll(goods);
        return this.goods;
    }

    public List<Integer> get() {
        return goods;
    }

}
