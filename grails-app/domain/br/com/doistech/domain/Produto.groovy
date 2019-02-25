package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class Produto {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String nome
    String sigla
    Integer pedidoMin

    Double desconto
    Double precoCusto

    Double precoVenda
    Double precoRevenda

    Double estoqueMin

    static constraints = {
        nome nullable: false
        sigla nullable: true
        pedidoMin nullable: true
        desconto nullable: true
        precoCusto nullable: true
        precoVenda nullable: true
        estoqueMin nullable: false
    }
}
