package one.digitalInovation.personapi.controller;


import one.digitalInovation.personapi.dto.MessageResponseDTO;
import one.digitalInovation.personapi.entity.Person;
import one.digitalInovation.personapi.repository.PersonRepository;
import one.digitalInovation.personapi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/people") // Caminho de acesso principal da API
public class PersonController {

    private PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody Person person){
        return personService.createPerson(person);
    }
}
