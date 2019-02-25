package br.com.doistech.domain

class Aplicacao {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String nome
    String descricao
    String url

    static constraints = {
    }
}
