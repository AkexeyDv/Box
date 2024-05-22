package com.pro.sky.Box;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BoxController {
    private final BoxInterface boxInterface;

    public BoxController(BoxInterface boxInterface) {
        this.boxInterface = boxInterface;
    }

    @GetMapping(path = "/store/order/add")
    public void productAddToBox(@RequestParam("id") List<Integer> idProduct){
        boxInterface.newProduct(idProduct);
    }
    @GetMapping(path = "/store/order/get")
    public String getProductFromBox(){
        return  boxInterface.toString();
    }
}
