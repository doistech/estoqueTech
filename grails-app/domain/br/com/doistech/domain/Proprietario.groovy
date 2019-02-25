package br.com.doistech.domain

class Proprietario {

    String criadoPor = 'EstoqueTech'
    Date dataCriacao = new Date()
    String atualizadoPor = 'EstoqueTech'
    Date dataAtualizacao = new Date()

    String tipoConta

    String razaoSocial
    String nomeFantasia
    String cnpj

    String nome
    String cpf

    String email
    String responsavelComercial

    static constraints = {
    }
}
