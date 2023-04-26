package com.example.thymeleaf.service;

import com.example.thymeleaf.model.Produto;
import com.example.thymeleaf.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository repository;

    public Produto findById(Long id){
        return repository.findById(id).orElseThrow(EntityNotFoundException::new);
    }
}
