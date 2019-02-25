package br.com.doistech.viewmodel

import br.com.doistech.domain.Usuario
import org.zkoss.bind.annotation.Init
import org.zkoss.zk.ui.Executions
import org.zkoss.zk.ui.Session
import org.zkoss.zk.ui.Sessions

class IndexViewModel {

    @Init
    public void init(){
//        Session sess = Sessions.getCurrent()
//        Usuario usuario = (Usuario)sess.getAttribute("usuario")
//        if(usuario == null){
//            // Executions.sendRedirect("/login.zul");
//            Executions.sendRedirect("/index.zul");
//        }
//        else{
//            Executions.sendRedirect("/index.zul");
//        }
    }
}
