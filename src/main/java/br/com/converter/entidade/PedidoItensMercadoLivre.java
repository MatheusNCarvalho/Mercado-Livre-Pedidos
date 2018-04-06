package br.com.converter.entidade;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PedidoItensMercadoLivre implements Serializable {

    private static final long serialVersionUID = -5930904419691645745L;

    private PedidoItemMercadoLivre pedidoItemMercadoLivre;
    private Integer qtd;
    private Double preco;

    public PedidoItensMercadoLivre() {
        qtd = 0;
        preco = 0.0;
        this.pedidoItemMercadoLivre = new PedidoItemMercadoLivre();
    }

    @JsonProperty("item")
    public PedidoItemMercadoLivre getPedidoItemMercadoLivre() {
        return pedidoItemMercadoLivre;
    }

    public void setPedidoItemMercadoLivre(PedidoItemMercadoLivre pedidoItemMercadoLivre) {
        this.pedidoItemMercadoLivre = pedidoItemMercadoLivre;
    }

    @JsonProperty("quantity")
    public Integer getQtd() {
        return qtd;
    }

    public void setQtd(Integer qtd) {
        this.qtd = qtd;
    }

    @JsonProperty("unit_price")
    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}