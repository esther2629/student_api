package com.example.formapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import com.example.formapi.model.CafeDb;
import com.example.formapi.service.CafeService;

@RestController
@RequestMapping("/api/cafe")
@CrossOrigin(origins = "*")
public class CafeController {

    private final CafeService service;

    public CafeController(CafeService service) {
        this.service = service;
    }

    @PostMapping
    public CafeDb saveItem(@RequestBody CafeDb item) {
        return service.saveItem(item);
    }

    @GetMapping
    public List<CafeDb> getAllItems() {
        return service.getAllItems();
    }
}