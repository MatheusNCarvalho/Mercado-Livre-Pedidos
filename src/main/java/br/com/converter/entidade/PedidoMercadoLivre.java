package br.com.converter.entidade;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class PedidoMercadoLivre implements Serializable {
    private static final long serialVersionUID = -5930904419691645745L;

    private Integer id;
    private List<PedidoItensMercadoLivre> pedidoItensMercadoLivreList;

    public PedidoMercadoLivre() {
        id=0;
        pedidoItensMercadoLivreList = new ArrayList<>();
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("order_items")
    public List<PedidoItensMercadoLivre> getPedidoItensMercadoLivreList() {
        return pedidoItensMercadoLivreList;
    }

    public void setPedidoItensMercadoLivreList(List<PedidoItensMercadoLivre> pedidoItensMercadoLivreList) {
        this.pedidoItensMercadoLivreList = pedidoItensMercadoLivreList;
    }
}

