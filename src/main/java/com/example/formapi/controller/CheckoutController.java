package com.example.formapi.controller;

import java.util.List;
import org.springframework.web.bind.annotation.*;

import com.example.formapi.model.Checkout;
import com.example.formapi.service.CheckoutService;

@RestController
@RequestMapping("/api/checkout")
@CrossOrigin(origins = "*")
public class CheckoutController {

    private final CheckoutService service;

    public CheckoutController(CheckoutService service) {
        this.service = service;
    }

    @PostMapping
    public Checkout saveCheckout(@RequestBody Checkout checkout) {
        return service.saveCheckout(checkout);
    }

    @GetMapping
    public List<Checkout> getAllCheckout() {
        return service.getAllCheckout();
    }


}