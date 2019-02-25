package br.com.doistech.domain

class PlanoAplicacao {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    Double preco

    Date dataInicio
    Date dataFim

    Boolean validacaoContrato
    Date dataValidacaoContrato

    Aplicacao aplicacao
    Plano plano


    static constraints = {
    }
}
