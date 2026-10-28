package com.example.formapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.formapi.model.Checkout;

public interface CheckoutRepository extends JpaRepository<Checkout, Long> {

}