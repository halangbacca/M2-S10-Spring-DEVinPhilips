package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/produto")
public class ProdutoController {

    @GetMapping
    public String getProduto(Model model) {
        model.addAttribute("nome", "Xiaomi Redmi Note 8 Pro");
        model.addAttribute("descricao", "Smartphone intermediário premium");
        model.addAttribute("dataLancamento", "2019");
        model.addAttribute("valor", "R$ 2.000");
        return "produto";
    }

}
