package com.pro.sky.Box;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoxController {
    private final BoxInterface boxInterface;

    public BoxController(BoxInterface boxInterface) {
        this.boxInterface = boxInterface;
    }

    @GetMapping(path = "/store/order/add")
    public void productAddToBox(@RequestParam("id") Integer idProdict){
        boxInterface.newProduct(idProdict);
    }
    @GetMapping(path = "/store/order/get")
    public String getProductFromBox(){
        return  boxInterface.toString();
    }
}
