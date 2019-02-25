package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class Pedido {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    Cliente cliente
    Date dataPedido
    Date dataEntrega
    String statusPedido
    Boolean statusEntrega
    Boolean statusPagamento

    static constraints = {
    }
}
