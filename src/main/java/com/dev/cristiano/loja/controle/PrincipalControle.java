package com.dev.cristiano.loja.controle;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrincipalControle {
    @GetMapping("administracao")
    public String acessaPrincipal() {
        
        return "administracao/home";
    }
}
