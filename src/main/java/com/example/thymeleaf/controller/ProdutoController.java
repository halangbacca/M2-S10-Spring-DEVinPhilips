package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Produto;
import com.example.thymeleaf.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService service;

    @GetMapping
    public String getProduto(Model model) {
        model.addAttribute("nome", "Xiaomi Redmi Note 8 Pro");
        model.addAttribute("descricao", "Smartphone intermediário premium");
        model.addAttribute("dataLancamento", "2019");
        model.addAttribute("valor", "R$ 2.000");

        Produto produto = service.findById(1L);
        produto.setNome("Xiaomi Redmi Note 8 Pro");
        produto.setDescricao("Smartphone intermediário premium");
        produto.setDataLancamento("2019");
        produto.setValor(1800.00);

        model.addAttribute("produto", produto);
        return "produto";
    }

}
