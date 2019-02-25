package br.com.doistech.domain

import br.com.doistech.domain.basic.BasicDomain

class Usuario {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String usuario
    String senha
    String nome

    static constraints = {
    }
}
