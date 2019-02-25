package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class EstoqueLot {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String lot
    Double estoque
    Produto produto
    Double estoqueAtual
    Date dataFabricacao

    static constraints = {
    }
}
