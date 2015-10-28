package com.troutbird

import grails.transaction.Transactional

@Transactional
class TenantResolverService {
    def springSecurityService

//    private def resolve() {
//        springSecurityService.getCurrentUser().userTenantId
//    }

    def resolveTenant(){
        springSecurityService.getCurrentUser().userTenantId
    }
}
