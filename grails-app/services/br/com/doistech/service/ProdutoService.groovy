package br.com.doistech.service

import br.com.doistech.domain.Produto
import grails.transaction.Transactional

@Transactional
class ProdutoService {
    def errorList = []
    Boolean hasError = false

    def salvarProduto(Produto produto){
        errorList.clear()
        if(produto.nome == null) {
            errorList.add("O nome do produto precisa se informada.")
            hasError = true
        }
        if(produto.estoqueMin == null){
            errorList.add("O estoque mínimo precisa ser informada.")
            hasError = true
        }

        if(hasError){
            return errorList
        }else{
            produto.save(flush:true, errors: true)
            return errorList
        }
    }
}
