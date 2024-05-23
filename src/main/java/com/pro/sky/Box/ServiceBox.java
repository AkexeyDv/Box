package com.pro.sky.Box;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceBox implements BoxInterface {
    private final BoxProduct box;

    public ServiceBox(BoxProduct box) {
        this.box = box;
    }


    @Override
    public void newProducts(List<Integer> idProducts) {
        box.addProducts(idProducts);

    }

    @Override
    public List getProducts() {
        return box.getProducts();
    }


}
