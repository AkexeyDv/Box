package com.pro.sky.Box;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServiceBox implements BoxInterface {
    private final List<Integer> productBox=new ArrayList<>();



    @Override
    public void newProduct(int idProduct) {
        productBox.add(idProduct);
    }

    @Override
    public String toString() {
        return "ServiceBox{" +
                "productBox=" + productBox +
                '}';
    }
}
