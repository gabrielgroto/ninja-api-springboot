package br.com.timbodev.CadastroDeNinjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController

public class Controller {
    @GetMapping("/boasvindas")
    public String boasVindas() {
        return "Boas Vindas";
    }
}
