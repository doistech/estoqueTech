package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class ItemPedido {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    Pedido pedido
    Produto produto
    Double quantidade
    Double preco

    static constraints = {
    }
}
