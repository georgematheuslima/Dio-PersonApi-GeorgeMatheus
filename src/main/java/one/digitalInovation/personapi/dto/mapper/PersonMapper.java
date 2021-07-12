package one.digitalInovation.personapi.dto.mapper;

import one.digitalInovation.personapi.dto.request.PersonDTO;
import one.digitalInovation.personapi.entity.Person;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PersonMapper {

    PersonMapper INSTANCE = Mappers.getMapper(PersonMapper.class);

    @Mapping(source = "birthDate" , target = "birthDate", dateFormat = "dd-MM-yyyy")
    Person toModel(PersonDTO personDTO);

    @Mapping(source = "birthDate" , target = "birthDate", dateFormat = "dd-MM-yyyy")
    PersonDTO toDTO(Person person);

}
