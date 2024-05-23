package com.pro.sky.Box;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.Collections;
import java.util.List;

@Component
@SessionScope
public class BoxProduct {
    private List<Integer> idProducts;

    public BoxProduct(List<Integer> productId) {
        this.idProducts = productId;
    }

    public void addProducts(List<Integer> listIdProducts) {
        idProducts.addAll(listIdProducts);
    }

    public List getProducts() {
        return Collections.unmodifiableList(idProducts);
    }
}
