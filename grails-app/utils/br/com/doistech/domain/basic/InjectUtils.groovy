package br.com.doistech.domain.basic

import grails.util.Holders

class InjectUtils {
    static def getBean(String beanName) {
        return Holders.grailsApplication.mainContext.getBean(beanName)
    }
}
