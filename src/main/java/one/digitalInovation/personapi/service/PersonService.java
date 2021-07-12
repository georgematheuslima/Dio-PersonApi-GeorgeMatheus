package one.digitalInovation.personapi.service;


import one.digitalInovation.personapi.dto.MessageResponseDTO;
import one.digitalInovation.personapi.dto.request.PersonDTO;
import one.digitalInovation.personapi.entity.Person;
import one.digitalInovation.personapi.dto.mapper.PersonMapper;
import one.digitalInovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PersonService {

    private PersonRepository personRepository;

    private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(PersonDTO personDTO) {
        Person personToSave = personMapper.toModel(personDTO);

        Person savedPerson = personRepository.save(personToSave);
        return MessageResponseDTO
                .builder()
                .message("Created person with ID " + savedPerson.getId())
                .build();

    }
}