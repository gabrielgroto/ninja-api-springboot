package br.com.timbodev.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

public class NinjaController {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Olá, bem vindo(a) à primeira rota da API!";
    }

}
