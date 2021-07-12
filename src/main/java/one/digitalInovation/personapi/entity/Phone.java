package one.digitalInovation.personapi.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalInovation.personapi.enums.PhoneType;

import javax.persistence.*;

@Entity // uma entidade
@Data // Isere Getters e Setter automaticamente
@Builder // Dá um padrao de projetos para construir objetos de forma mais fácil
@AllArgsConstructor // insere os construtores
@NoArgsConstructor// insere os construtores
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Incrementa automaticamente
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // cria um campo do tipo notnull
    private PhoneType type;

    @Column(nullable = false) // cria um campo do tipo notnull
    private String number;
}
