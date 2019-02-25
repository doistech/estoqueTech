package br.com.doistech.domain

class Plano {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String nome
    Double preco
    Integer prazo

    static constraints = {
    }
}
