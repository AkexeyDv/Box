package com.pro.sky.Box;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Component
@SessionScope
public class BoxProduct {
    private List<Integer> productId;

    public BoxProduct(List<Integer> productId) {
        this.productId = productId;
    }

    public List<Integer> addProduct(List<Integer> listIdProduct) {
        productId.addAll(listIdProduct);
        return productId;
    }


    @Override
    public String toString() {
        return productId + "";
    }
}
