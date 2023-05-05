package ru.netology.task1SpringJDBC.service;

import org.springframework.web.bind.annotation.RequestParam;
import ru.netology.task1SpringJDBC.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class Service {
    Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public List<String> getProducts(String name) {
        return repository.getProductName(name);
    }
}