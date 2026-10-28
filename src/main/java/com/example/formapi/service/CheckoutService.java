package com.example.formapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.formapi.model.Checkout;
import com.example.formapi.repository.CheckoutRepository;

@Service
public class CheckoutService {

    private final CheckoutRepository repo;

    public CheckoutService(CheckoutRepository repo) {
        this.repo = repo;
    }

    public Checkout saveCheckout(Checkout checkout) {
        return repo.save(checkout);
    }

    public List<Checkout> getAllCheckout() {
        return repo.findAll();
    }
}