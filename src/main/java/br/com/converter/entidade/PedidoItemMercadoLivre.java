package br.com.converter.entidade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;


import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PedidoItemMercadoLivre implements Serializable{
    private static final long serialVersionUID = -5930904419691645745L;

    private String id;
    private String nome;

    public PedidoItemMercadoLivre() {
        id="";
        nome="";
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("title")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
