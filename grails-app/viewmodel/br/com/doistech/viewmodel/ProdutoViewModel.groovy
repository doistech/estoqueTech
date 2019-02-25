package br.com.doistech.viewmodel

import br.com.doistech.domain.Categoria
import br.com.doistech.domain.Produto
import br.com.doistech.domain.basic.InjectUtils
import br.com.doistech.service.ProdutoService
import org.zkoss.bind.annotation.Command
import org.zkoss.bind.annotation.Init
import org.zkoss.bind.annotation.NotifyChange

class ProdutoViewModel {

    ProdutoService produtoService

    Produto produto

    List<Produto> produtoList = []
    List<Categoria> categoriaList = []

    Boolean visibleSearch = true

    def errorList = []
    boolean hasError = false

    @Init
    public void init(){
        produtoService = InjectUtils.getBean('produtoService')
    }

    @Command
    @NotifyChange(['visibleSearch'])
    void novoProdutoFormVisible(){
        visibleSearch = false
    }

    @Command
    @NotifyChange(['visibleSearch', 'produto', 'hasError'])
    void incluirProduto(){
        errorList = produtoService.salvarProduto(produto)
        if(errorList.size() > 0){
            hasError = true
        }
    }
}
