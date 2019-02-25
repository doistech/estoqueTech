package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class Cliente {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String nome
    String telefone
    String telefoneAux
    String celular
    String celularAux
    String eMail
    String tipo

    Usuario usuario

    static constraints = {
    }
}
