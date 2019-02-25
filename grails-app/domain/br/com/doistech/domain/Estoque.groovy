package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class Estoque {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String descricao
    Double quantidade

    static constraints = {
    }
}
