package br.com.sunny.day.cadastro.entrega.objects;

import lombok.Data;

@Data
public class Cep {

    private String logradouro;

    private String bairro;

    private String localidade;

    private String uf;

    private Boolean realizaEntrega;
}
