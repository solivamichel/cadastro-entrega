package br.com.sunny.day.cadastro.entrega.objects;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "client")
public class Client {

    private Integer id;

    private String name;

    private String user;

    private String password;

    private String cep;

    private GenderEnum gender;

    private LocalDate birthDate;
}
