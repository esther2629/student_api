package com.example.formapi.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.formapi.model.CafeDb;
import com.example.formapi.repository.CafeRepository;

@Service
public class CafeService {

    private final CafeRepository repo;

    public CafeService(CafeRepository repo) {
        this.repo = repo;
    }

    public CafeDb saveItem(CafeDb item) {
        return repo.save(item);
    }

    public List<CafeDb> getAllItems() {
        return repo.findAll();
    }
}