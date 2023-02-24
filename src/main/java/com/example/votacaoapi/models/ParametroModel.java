package com.example.votacaoapi.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document("parametros")
public class ParametroModel {

    @Id
//    public String id;
    public String chave;
    public String valor;
}
