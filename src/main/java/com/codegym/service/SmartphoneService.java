package com.codegym.service;

import com.codegym.model.Smartphone;

public interface SmartphoneService {
    Iterable<Smartphone> findAll();

    Smartphone findById(Integer id);

    void save(Smartphone smartphone);

    void remove(Integer id);
}
