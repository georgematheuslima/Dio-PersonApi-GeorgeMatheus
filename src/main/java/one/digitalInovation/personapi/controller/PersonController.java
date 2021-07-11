package one.digitalInovation.personapi.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/people") // Caminho de acesso principal da API
public class PersonController {

    @GetMapping // Operação HTTP do tipo GET
    public String getBook(){
        return "API test";
    }
}
